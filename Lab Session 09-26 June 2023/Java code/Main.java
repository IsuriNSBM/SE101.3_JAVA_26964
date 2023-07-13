/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author DELL
 */
public class Main {

public static void main(String[] args) {
        Player regularPlayer = new RegularPlayer();
        regularPlayer.moveUp();
        regularPlayer.moveDown();
        regularPlayer.moveLeft();
        regularPlayer.moveRight();
      
        Player oppositePlayer = new OppositePlayer();
        oppositePlayer.moveUp();
        oppositePlayer.moveDown();
        oppositePlayer.moveLeft();
        oppositePlayer.moveRight();
      
        Player jumpingPlayer = new JumpingPlayer();
        jumpingPlayer.moveUp();
        jumpingPlayer.moveDown();
        jumpingPlayer.moveLeft();
        jumpingPlayer.moveRight();
      
        Player crouchingPlayer = new CrouchingPlayer();
        crouchingPlayer.moveUp();
        crouchingPlayer.moveDown();
        crouchingPlayer.moveLeft();
        crouchingPlayer.moveRight();
    }
}
