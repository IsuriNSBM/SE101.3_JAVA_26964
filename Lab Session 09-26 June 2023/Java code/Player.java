
package com.mycompany.main;

    abstract class Player {
    public abstract void moveUp();
    public abstract void moveDown();
    public abstract void moveLeft();
    public abstract void moveRight();
}

class RegularPlayer extends Player {
    @Override
    public void moveUp() {
        System.out.println("Regular Player moved up");
    }

    @Override
    public void moveDown() {
        System.out.println("Regular Player moved down");
    }

    @Override
    public void moveLeft() {
        System.out.println("Regular Player moved left");
    }

    @Override
    public void moveRight() {
        System.out.println("Regular Player moved right");
    }
}

class OppositePlayer extends Player {
    @Override
    public void moveUp() {
        System.out.println("Opposite Player moved down");
    }

    @Override
    public void moveDown() {
        System.out.println("Opposite Player moved up");
    }

    @Override
    public void moveLeft() {
        System.out.println("Opposite Player moved right");
    }

    @Override
    public void moveRight() {
        System.out.println("Opposite Player moved left");
    }
}

class JumpingPlayer extends Player {
    @Override
    public void moveUp() {
        System.out.println("Jumping Player moved up by 5 spaces");
    }

    @Override
    public void moveDown() {
        System.out.println("Jumping Player moved down by 5 spaces");
    }

    @Override
    public void moveLeft() {
        System.out.println("Jumping Player moved left by 5 spaces");
    }

    @Override
    public void moveRight() {
        System.out.println("Jumping Player moved right by 5 spaces");
    }
}

class CrouchingPlayer extends JumpingPlayer {
    @Override
    public void moveUp() {
        System.out.println("Crouching Player moved up by 2 spaces");
    }

    @Override
    public void moveDown() {
        System.out.println("Crouching Player moved down by 2 spaces");
    }

    @Override
    public void moveLeft() {
        System.out.println("Crouching Player moved left by 2 spaces");
    }

    @Override
    public void moveRight() {
        System.out.println("Crouching Player moved right by 2 spaces");
    }
}

