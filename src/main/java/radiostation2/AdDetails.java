package radiostation2;

import java.io.IOException;

public class AdDetails extends ContentGenerator {

    public void ProductName() throws IOException {
        StringContentDetails(1, 2);

    }
    public void AdLength() throws IOException {
        intContentDetails(2, 2);
    }

}
