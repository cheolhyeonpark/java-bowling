package qna.domain;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

public class AnswerTest {
    public static final Answer A1 = new Answer(UserTest.JAVAJIGI, QuestionTest.Q1, "Answers Contents1");
    public static final Answer A2 = new Answer(UserTest.SANJIGI, QuestionTest.Q1, "Answers Contents2");

    @Test
    public void testDelete() {
        DeleteHistory deleteHistory = A2.delete();
        DeleteHistory comparison = new DeleteHistory(ContentType.ANSWER, null, UserTest.SANJIGI, LocalDateTime.now());
        assertThat(deleteHistory).isEqualTo(comparison);
    }
}
