package fr.afcepf.al22.riaserveur2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import fr.afcepf.al22.riaserveur2.dao.IDaoRepas;
import fr.afcepf.al22.riaserveur2.dto.RepasDTO;
import fr.afcepf.al22.riaserveur2.entity.Repas;

@Controller
public class ServiceRepasSpring {

	@Autowired
	private IDaoRepas daoRepas;

	@RequestMapping(value = "/repas/rechercher/{libelle}", produces = { "application/json" })
	@ResponseBody
	public List<RepasDTO> method(@PathVariable(value = "libelle") String libelle) {
		List<Repas> listeRepas = daoRepas.rechercher(libelle);

		List<RepasDTO> listeRepasDTO = new ArrayList<RepasDTO>();
		for (Repas repas : listeRepas) {
			listeRepasDTO.add(EntityToDTO(repas));
		}
		System.out.println("Dans ServiceRepasSpring.rechercher liste DTO a " + listeRepasDTO.size() + " éléments");
		return listeRepasDTO;
	}

	@RequestMapping("/repasMessage/rechercher/{libelle}")
	@Transactional
	public ModelAndView rechercher(@PathVariable(value = "libelle") String libelle) {

		List<Repas> listeRepas = daoRepas.rechercher(libelle);
		String message = "";

		List<RepasDTO> listeRepasDTO = new ArrayList<RepasDTO>();
		for (Repas repas : listeRepas) {
			listeRepasDTO.add(EntityToDTO(repas));
			message += repas.getLibelle();
		}
		System.out.println("Dans ServiceRepasSpring.rechercher liste DTO a " + listeRepasDTO.size() + " éléments");
		// return listeRepasDTO;

		return new ModelAndView("hello", "message", message);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.afcepf.al22.ria.IServiceRepasRest#rechercher()
	 */
	/*
	 * @RequestMapping("/repas/rechercher") public List<RepasDTO> rechercherTous() { return rechercher(""); }
	 */

	private RepasDTO EntityToDTO(Repas repas) {
		RepasDTO repasDTO = new RepasDTO(repas.getId(), repas.getNbCal(), repas.getDescription(), repas.getLibelle());
		return repasDTO;
	}

	private Repas DTOToEntity(RepasDTO repasDTO) {
		Repas repas = new Repas(repasDTO.getId(), repasDTO.getNb_cal(), repasDTO.getDescription(), repasDTO.getLibelle());
		return repas;
	}

}
