/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import controller.ControleHockeyPlayer;
import java.util.ArrayList;
import model.HockeyPlayer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ramses
 */
public class ControleHockeyPlayerTest {
    
    public ControleHockeyPlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    /**
     * Test of adicionarHockeyPlayer method, of class ControleHockeyPlayer.
     */
    @Test
    public void testAdicionarHockeyPlayer() {
        System.out.println("adicionarHockeyPlayer");
        HockeyPlayer novoHockeyPlayer = null;
        ControleHockeyPlayer instance = new ControleHockeyPlayer();
        instance.adicionarHockeyPlayer(novoHockeyPlayer);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of removerHockeyPlayer method, of class ControleHockeyPlayer.
     */
    @Test
    public void testRemoverHockeyPlayer() {
        System.out.println("removerHockeyPlayer");
        HockeyPlayer hockeyPlayer = null;
        ControleHockeyPlayer instance = new ControleHockeyPlayer();
        instance.removerHockeyPlayer(hockeyPlayer);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of pesquisarUmHockeyPlayer method, of class ControleHockeyPlayer.
     */
    @Test
    public void testPesquisarUmHockeyPlayer() {
        System.out.println("pesquisarUmHockeyPlayer");
        String nome = "";
        ControleHockeyPlayer instance = new ControleHockeyPlayer();
        HockeyPlayer expResult = null;
        HockeyPlayer result = instance.pesquisarUmHockeyPlayer(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}