package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class ChessFactory {
    private static final Map<String, ChessPiece> cache = new HashMap<>();

    public static ChessPiece getChessPiece(String color) {
        ChessPiece piece = cache.get(color);
        if (piece == null) {
            if ("黑色".equalsIgnoreCase(color)) {
                piece = new BlackChessPiece();
            } else if ("白色".equalsIgnoreCase(color)) {
                piece = new WhiteChessPiece();
            } else {
                throw new IllegalArgumentException("不支持的颜色: " + color);
            }
            cache.put(color, piece);
        }
        return piece;
    }
}