package homework_13;

public class Color {
    private final int r, g, b;
    
    private Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }
    
    public static Color fromRGB(int r, int g, int b) {
        if (r < 0 || r > 255 || g < 0 || g > 255 || b < 0 || b > 255) {
            throw new IllegalArgumentException("RGB значения должны быть в диапазоне 0-255");
        }
        return new Color(r, g, b);
    }
    
    public static Color fromHex(String hex) {
        if (hex.startsWith("#")) {
            hex = hex.substring(1);
        }
        
        if (hex.length() != 6) {
            throw new IllegalArgumentException("Hex должен быть в формате #RRGGBB или RRGGBB");
        }
        
        try {
            int r = Integer.parseInt(hex.substring(0, 2), 16);
            int g = Integer.parseInt(hex.substring(2, 4), 16);
            int b = Integer.parseInt(hex.substring(4, 6), 16);
            
            return new Color(r, g, b);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Некорректный hex формат", e);
        }
    }
    
    public String toHex() {
        return String.format("#%02X%02X%02X", r, g, b);
    }
}