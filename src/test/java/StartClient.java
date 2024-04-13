import net.minecraft.client.main.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StartClient {
    public static void main(String[] args) {
        List<String> additionalArgs = Arrays.asList(
                // Account-related
                "--username", "little_haxor",
                "--accessToken", "0",
                "--uuid", "41cdf1dc-19cd-460e-92d8-5e5dd13848ad",
                "--userProperties", "{}",

                // Version-related
                "--version", "Evanescent",
                "--assetIndex", "1.8",

                // Folder-related
                "--gameDir", System.getProperty("user.dir"),
                "--assetsDir", "assets"
        );

        List<String> allArgs = new ArrayList<>(Arrays.asList(args));
        allArgs.addAll(additionalArgs);

        Main.main(allArgs.toArray(new String[0]));
    }
}
