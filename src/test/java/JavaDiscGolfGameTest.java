import discgolf.JavaDiscGolfGame;
import discgolf.Hole;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class JavaDiscGolfGameTest {

    @Test
    public void testComputeScore() {
        assertThat(JavaDiscGolfGame.score(15, 12), is("+3"));
        assertThat(JavaDiscGolfGame.score(21, 23), is("-2"));
    }


    @Test
    public void testScoreGame() {
        List<Hole> holes = new ArrayList<>();
        holes.add(new Hole(1, 4, 5));
        holes.add(new Hole(2, 3, 5));
        holes.add(new Hole(3, 5, 7));
        assertThat(JavaDiscGolfGame.scoreGame(holes), is("+5"));
    }


}
