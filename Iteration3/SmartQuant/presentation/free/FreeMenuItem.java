package free;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JMenuItem;
import javax.swing.border.Border;

public class FreeMenuItem extends JMenuItem {

    private Color backgroundColor = FreeUtil.MENUITEM_BACKGROUND;
    private Color foregroundColor = FreeUtil.DEFAULT_TEXT_COLOR;
    private int borderThickness = 1;
    private Border border = BorderFactory.createLineBorder(backgroundColor, borderThickness);
    private int preferredHeight = 23;

    public FreeMenuItem() {
        init();
    }

    public FreeMenuItem(String text) {
        super(text);
        init();
    }

    private void init() {
        this.setForeground(foregroundColor);
        this.setFont(FreeUtil.FONT_14_BOLD);
        this.setBackground(backgroundColor);
        this.setBorder(border);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(super.getPreferredSize().width, preferredHeight);
    }
}
