package sistema.ciu;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import java.util.regex.Pattern;

public class Reg extends PlainDocument {
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if(Pattern.matches("^[a-zA-Z ]+$", str)){
            super.insertString(offs,str,a);
        }
    }
}
class Reg2 extends PlainDocument{
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if (Pattern.matches("[0-9]+$", str)) {
            super.insertString(offs, str, a);
        }
    }
}
