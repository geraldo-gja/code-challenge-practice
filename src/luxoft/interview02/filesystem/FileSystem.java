package luxoft.interview02.filesystem;

import java.time.LocalDateTime;

public enum FileSystem {
    FILE_SYSTEM;


    public static File[][] files = new File[5][5];

    static {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                long size = 1000 * (i+j);
                String name = "file" + i + j;
                final LocalDateTime creationTime = LocalDateTime.of(2022, 12, i+j+1, 12, 12);
                Permissions permission = Permissions.values()[(10*i+j) % 3];
                files[i][j] = new File(size, name, creationTime, permission);
            }
        }
    }
}
