import org.junit.Assert;
import org.junit.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {

    @Test
    public void testRemainWhenAmountLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;  // 1000 - 900%1000 = 100
        Assert.assertEquals(service.remain(amount), expected);
    }

    @Test
    public void testRemainWhenAmountExactlyBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 1000; // 1000 - 1000%1000 = 1000
        Assert.assertEquals(service.remain(amount), expected);
    }

    @Test
    public void testRemainWhenAmountAboveBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2500;
        int expected = 1000 - (2500 % 1000); // 1000 - 500 = 500
        Assert.assertEquals(service.remain(amount), expected);
    }
}
