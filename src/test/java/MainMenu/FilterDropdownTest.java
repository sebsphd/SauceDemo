package MainMenu;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class FilterDropdownTest extends BaseTest {
    @Test
    public void testFilterDropdown(){
        List<String> checkFilter = new ArrayList<>();
        checkFilter.add("Name (A to Z)");
        checkFilter.add("Name (Z to A)");
        checkFilter.add("Price (low to high)");
        checkFilter.add("Price (high to low)");

        List<String> realFilter = mainPage.getFilterList();
//        mainPage.getFilterList();
        System.out.println(realFilter);
        Assert.assertTrue(realFilter.containsAll(checkFilter),"Filter is correct");

    }

    @Test
    public void clickFilterOption(){
        String clickedFilter = mainPage.clickFilter("Name (Z to A)");
        Assert.assertEquals(clickedFilter,"Name (Z to A)");
    }
}
