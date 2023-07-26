//package Steps;
//
//import com.codeborne.selenide.Selenide;
//import com.codeborne.selenide.SelenideElement;
//
//public class SearchForJavaBook {
//    public static void main(String[] args) {
//
//        Selenide.open("https://www.yakaboo.ua/");
//
//
//        SelenideElement searchInput = Selenide.$x("//*[@id='search']");
//        searchInput.click();
//        searchInput.setValue("Java").pressEnter();
//    }
//}