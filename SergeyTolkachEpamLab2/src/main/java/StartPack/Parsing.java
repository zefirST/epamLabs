package StartPack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public interface Parsing {
    List<?> parse(File file) throws FileNotFoundException;
}
