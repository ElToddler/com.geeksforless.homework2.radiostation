package radiostation2;

import java.io.IOException;

public class SongDetails extends ContentGenerator {
    public void SongName() throws IOException {
        contentDetails(1, 0);
    }
    public void SongArtist() throws IOException {
        contentDetails(0, 0);
}
    public void SongLength() throws IOException {
        contentDuration(2, 0);
    }


}

