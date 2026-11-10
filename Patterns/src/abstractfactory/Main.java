package abstractfactory;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("=== Tema Claro ===");
        Application light = new Application(new LightThemeFactory());
        light.createUI();
        light.render();

        System.out.println();

        System.out.println("=== Tema Escuro ===");
        Application dark = new Application(new DarkThemeFactory());
        dark.createUI();
        dark.render();
    }
}
