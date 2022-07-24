package radiostation2;

import java.io.IOException;

public class InterviewDetails extends ContentGenerator {

        public void InterviewName() throws IOException {
            StringContentDetails(1, 1);
        }
        public void InterviewPerformer() throws IOException {
            StringContentDetails(0, 0);
        }
        public void InterviewLength() throws IOException {
            intContentDetails(2, 1);
        }

}
