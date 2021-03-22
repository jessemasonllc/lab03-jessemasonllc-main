package exercises;

public class BackTrackProgram {

    private static void goNorthEast(int endX, int endY, int x, int y, String route) {

        if (x == endX && y == endY) {
            System.out.println(route);

        }else if(x <= endX && y <= endY){
            goNorthEast(endX, endY, x, y + 1, route + " N");
            goNorthEast(endX, endY,x + 1, y, route + " E");
            goNorthEast(endX, endY,x + 1, y + 1, route + " NE");
        }

        //OTHERWISE : DO NOTHING
    }

    public static void goNorthEast(int endX, int endY) {
        goNorthEast(endX, endY, 0, 0, "moves:");
    }

    public static void main(String[] args) {
        goNorthEast(1,2);
    }
}
