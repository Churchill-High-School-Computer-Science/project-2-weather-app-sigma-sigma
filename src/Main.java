public class Main {
    public static void main(String[] args) {

        WeatherAPI weather = new WeatherAPI();
        GUI gui = new GUI(weather);

        gui.createWindow();
        gui.setUpButton();
        gui.cyanBackground();
    }
}
