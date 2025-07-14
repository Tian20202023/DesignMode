package Flyweight;

public class Client {
    public static void main(String[] args) {
        ChessFactory cf = new ChessFactory();

        ChessPiece BlackPiece1 = cf.getChessPiece("黑色");
        ChessPiece BlackPiece2 = cf.getChessPiece("黑色");
        ChessPiece WhitePiece = cf.getChessPiece("白色");

        BlackPiece1.display(2, 3);
        BlackPiece2.display(5, 7);
        WhitePiece.display(4, 6);

        System.out.println("black1 == black2 ? "+ (BlackPiece1 == BlackPiece2));
    }
}