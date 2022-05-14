import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        StringBuilder status = new StringBuilder();
        File src = new File("E://Games/src");
        File res = new File("E://Games/res");
        File saveGames = new File("E://Games/savegames");
        File temp = new File("E://Games/temp");
        if (src.mkdir()) {
            File main = new File("E://Games/main");
            File test = new File("E://Games/test");
            if (main.mkdir()) {
                status.RecordStatus("Дериктория main создана; ");
                File mainFile = new File("E://Games/main/Main.java");
                try {
                    if (mainFile.createNewFile())
                        status.RecordStatus("Файл Main.java создан; ");
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                File utilsFile = new File("E://Games/main/Utils.java");
                try {
                    if (utilsFile.createNewFile())
                        status.RecordStatus("Файл Utils.java создан; ");
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            if (test.mkdir()) {
                status.RecordStatus("Дериктория test создана; ");
            }
        }
        if (res.mkdir()) {
            status.RecordStatus("Дериктория res создана; ");
            File drawables = new File("E://Games/res/drawables");
            File vectors = new File("E://Games/res/vectors");
            File icons = new File("E://Games/res/icons");
            if (drawables.mkdir()) {
                status.RecordStatus("Дериктория drawables создана; ");
            }
            if (vectors.mkdir()) {
                status.RecordStatus("Дериктория vectors создана; ");
            }
            if (icons.mkdir()) {
                status.RecordStatus("Дериктория icons создана; ");
            }
        }
        if (saveGames.mkdir()) {
            status.RecordStatus("Дериктория saveGames создана; ");
        }
        if (temp.mkdir()) {
            status.RecordStatus("Дериктория temp создана; ");
            try (FileWriter tempFile = new FileWriter("E://Games/temp/temp.txt", false);) {
                tempFile.write(status.getStatus());
                tempFile.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
