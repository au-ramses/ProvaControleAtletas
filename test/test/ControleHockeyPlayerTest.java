/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import controller.ControleHockeyPlayer;
import model.HockeyPlayer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ramses
 */
public class ControleHockeyPlayerTest {
    
    public ControleHockeyPlayerTest() {
    }
    private ControleHockeyPlayer controleHockeyPlayer;
    private HockeyPlayer novoHockeyPlayer;
    @Before
    public void setUp() throws Exception{
        controleHockeyPlayer = new ControleHockeyPlayer();
        novoHockeyPlayer = new HockeyPlayer("Ramses");
        controleHockeyPlayer.adicionarHockeyPlayer(novoHockeyPlayer);
    }
    
    @Test
    public void testGetListaHockeyPlayers() {
        assertNotNull(controleHockeyPlayer.getListaHockeyPlayers());
    }

    @Test
    public void testAdicionarHockeyPlayer() {
        novoHockeyPlayer = new HockeyPlayer("Lucas");
        controleHockeyPlayer.adicionarHockeyPlayer(novoHockeyPlayer);
        assertEquals(novoHockeyPlayer, controleHockeyPlayer.pesquisarUmHockeyPlayer("Lucas"));
    }

    @Test
    public void testRemoverHockeyPlayer() {
        controleHockeyPlayer.removerHockeyPlayer(novoHockeyPlayer);
        assertNull(controleHockeyPlayer.pesquisarUmHockeyPlayer("Ramses"));
    }

    @Test
    public void testPesquisarUmHockeyPlayer() {
        controleHockeyPlayer.pesquisarUmHockeyPlayer("Ramses");
        assertEquals(novoHockeyPlayer, controleHockeyPlayer.pesquisarUmHockeyPlayer("Ramses"));
    }
}