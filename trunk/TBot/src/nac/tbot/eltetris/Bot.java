/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nac.tbot.eltetris;

/**
 *
 * @author camomot
 */
public interface Bot {

  public Move[] move(Board board, int currentMino, int nextMino);

  public Move move(Board board, int currentMino);
  
}
