package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTest {

    @Test
    public void testSelectOption(){
         var dropDownPage = homePage.clickDropDown();
         String option= "Option 1";
         dropDownPage.selectFromDropDown(option);
         var selectedOptions= dropDownPage.getSelectedOptions();
         assertEquals(selectedOptions.size(), 1, "Incorrect number of options");
         assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
