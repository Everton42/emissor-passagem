package br.unip.team.emissopassagem.controller;

import br.unip.team.emissopassagem.model.entidade.Itinerario;
import br.unip.team.emissopassagem.model.servico.ItinerarioServico;

public class ItinerarioController {
    private ItinerarioServico servico;

    public ItinerarioController(){
        servico = new ItinerarioServico();
    }
    
    public int adicionarItinerario(Itinerario obj) {
    	 return servico.adicionar(obj);
    }
}
