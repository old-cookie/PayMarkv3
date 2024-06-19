package oldcookie.paymarkv3.db;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountBeanTest {
    private AccountBean accountBean;

    @Before
    public void setUp() {
        accountBean = new AccountBean(1, "Test", 1, "Test Comment", 100.0f, "12:00", 2022, 1, 1, 1);
    }

    @Test
    public void testGetId() {
        assertEquals(1, accountBean.getId());
    }

    @Test
    public void testSetId() {
        accountBean.setId(2);
        assertEquals(2, accountBean.getId());
    }

    @Test
    public void testGetTypename() {
        assertEquals("Test", accountBean.getTypename());
    }

    @Test
    public void testSetTypename() {
        accountBean.setTypename("Test2");
        assertEquals("Test2", accountBean.getTypename());
    }

    @Test
    public void testGetsImageId() {
        assertEquals(1, accountBean.getsImageId());
    }

    @Test
    public void testSetsImageId() {
        accountBean.setsImageId(2);
        assertEquals(2, accountBean.getsImageId());
    }

    @Test
    public void testGetComment() {
        assertEquals("Test Comment", accountBean.getComment());
    }

    @Test
    public void testSetComment() {
        accountBean.setComment("Test Comment2");
        assertEquals("Test Comment2", accountBean.getComment());
    }

    @Test
    public void testGetMoney() {
        assertEquals(100.0f, accountBean.getMoney(), 0.0f);
    }

    @Test
    public void testSetMoney() {
        accountBean.setMoney(200.0f);
        assertEquals(200.0f, accountBean.getMoney(), 0.0f);
    }

    @Test
    public void testGetTime() {
        assertEquals("12:00", accountBean.getTime());
    }

    @Test
    public void testSetTime() {
        accountBean.setTime("1:00");
        assertEquals("1:00", accountBean.getTime());
    }

    @Test
    public void testGetYear() {
        assertEquals(2022, accountBean.getYear());
    }

    @Test
    public void testSetYear() {
        accountBean.setYear(2023);
        assertEquals(2023, accountBean.getYear());
    }

    @Test
    public void testGetMonth() {
        assertEquals(1, accountBean.getMonth());
    }

    @Test
    public void testSetMonth() {
        accountBean.setMonth(2);
        assertEquals(2, accountBean.getMonth());
    }

    @Test
    public void testGetDay() {
        assertEquals(1, accountBean.getDay());
    }

    @Test
    public void testSetDay() {
        accountBean.setDay(2);
        assertEquals(2, accountBean.getDay());
    }

    @Test
    public void testGetKind() {
        assertEquals(1, accountBean.getKind());
    }

    @Test
    public void testSetKind() {
        accountBean.setKind(2);
        assertEquals(2, accountBean.getKind());
    }
}