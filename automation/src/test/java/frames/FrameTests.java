package frames;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTest {
    @Test
    public void testWysiwyg(){
        String text1 = "hello ";
        String text2 = "world";
        var editorPage = homePage.clickWysiwygEditor();


        editorPage.clearTextArea();
        editorPage.setTextArea(text1);
        editorPage.decreaseIndention();
        editorPage.setTextArea(text2);
        assertEquals(editorPage.getTextFromEditor(), text1+text2, "Text from editor is incorrect");

    }

}
