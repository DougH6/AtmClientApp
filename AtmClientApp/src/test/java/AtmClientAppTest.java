import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AtmClientAppTest {

    //arrange
    Atm underTest = new Atm(50, "1234");

@Test
   public void shouldHaveADefaultBalnceOf50() {

   //act
    double expectedBalance = underTest.getBalance();
   //assert
    assertEquals(50, expectedBalance);


}
 @Test
    public void shouldHaveADefaultBalanceOf100(){
    Atm underTest = new Atm(100, "1234");
     double expectedBalance = underTest.getBalance();
     assertEquals(100, expectedBalance);

 }

@Test
    public void depositof50ShouldIncreaseBalanceof50To100(){
    underTest.deposit(50);
    double actualBalance = underTest.getBalance();
    assertEquals(100, actualBalance);
}




@Test
    public void withdrawlof50ShouldDecreaseBalanceofTo0(){

        underTest.withdrawl(50);
        double actualBalance = underTest.getBalance();
        assertEquals(0, actualBalance);


    }
@Test
    public void withdrawOfShouldReturnOrginalBalanceOf50(){
    underTest.withdrawl(51);
    double actualBalance = underTest.getBalance();
    assertEquals(50, actualBalance);
}
@Test
    public void shouldAllowUserAccessWithCorrectPin(){
    boolean accessResult = underTest.accessAccount("1234");
    assertEquals(true, accessResult);

}
@Test
    public void shouldDenyUserWithWrongPin(){
    boolean accessResult = underTest.accessAccount("1434");
    assertEquals(false, accessResult);


}


}
