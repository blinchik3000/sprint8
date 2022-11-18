import io.qameta.allure.Description;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountTest {

    private final String name;
    private final boolean isCorrectExpected;

    public AccountTest(String name,boolean isCorrectExpected) {
        this.name = name;
        this.isCorrectExpected=isCorrectExpected;
    }

    @Parameterized.Parameters
    public static Object[][] getNames(){
        return new Object[][]{
            {"",false},
            {"12",false},
            {"12345678901234567890",false},
            {"1234567890123456789",false},
            {"qwe qwe qwe",false},
            {" qwe",false},
            {"qwe ",false},
            {"z q",true},
            {"Тимоте Шаламе",true},
        };
    }

    @Test
    @Description("тест с разными именами")
    public void checkNameIsEmpty(){
        Account account=new Account(name);
        Assert.assertEquals(isCorrectExpected,account.checkNameToEmboss());
    }
}
