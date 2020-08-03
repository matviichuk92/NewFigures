public enum Color {
    RED("червоний"),
    GREEN("зелений"),
    BLACK("чорний"),
    WHITE("білий");

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
