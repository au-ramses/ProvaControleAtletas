package controller;
import model.HockeyPlayer;

import java.util.ArrayList;

public class ControleHockeyPlayer {
	private ArrayList<HockeyPlayer> listaHockeyPlayers;
        
        public ControleHockeyPlayer(){
		this.listaHockeyPlayers = new ArrayList<>();
	}
	
	public ArrayList<HockeyPlayer> getListaHockeyPlayers(){
		return this.listaHockeyPlayers;
	}
	
	public void adicionarHockeyPlayer(HockeyPlayer novoHockeyPlayer){
		this.listaHockeyPlayers.add(novoHockeyPlayer);
	}
	
	public void removerHockeyPlayer(HockeyPlayer hockeyPlayer){
		this.listaHockeyPlayers.remove(hockeyPlayer);
	}
	
	public HockeyPlayer pesquisarUmHockeyPlayer(String nome){
		for(HockeyPlayer hockPlayer: listaHockeyPlayers){
			if (hockPlayer.getNome().equalsIgnoreCase(nome)) return hockPlayer;
	    }
	    return null;
	}
}
