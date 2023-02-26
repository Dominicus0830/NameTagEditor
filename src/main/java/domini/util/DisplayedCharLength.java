package domini.util;

public enum DisplayedCharLength {

    a('A', 5),
    b('a', 5),
    c('B', 5),
    d('b', 5),
    e('C', 5),
    f('c', 5),
    g('D', 5),
    h('d', 5),
    i('E', 5),
    j('e', 5),
    k('F', 5),
    l('f', 4),
    m('G', 5),
    n('g', 5),
    o('H', 5),
    p('h', 5),
    q('I', 3),
    r('i', 1),
    s('J', 5),
    t('j', 5),
    u('K', 5),
    v('k', 4),
    w('L', 5),
    x('l', 2),
    y('M', 5),
    z('m', 5),
    A('N', 5),
    B('n', 5),
    C('O', 5),
    D('o', 5),
    E('P', 5),
    F('p', 5),
    G('Q', 5),
    H('q', 5),
    I('R', 5),
    J('r', 5),
    K('S', 5),
    L('s', 5),
    M('T', 5),
    N('t', 4),
    O('U', 5),
    P('u', 5),
    Q('V', 5),
    R('v', 5),
    S('W', 5),
    T('w', 5),
    U('X', 5),
    V('x', 5),
    W('Y', 5),
    X('y', 5),
    Y('Z', 5),
    Z('z', 5),
    aa('1', 5),
    ab('2', 5),
    ac('3', 5),
    ad('4', 5),
    ae('5', 5),
    af('6', 5),
    ag('7', 5),
    ah('8', 5),
    ai('9', 5),
    aj('0', 5),
    ak('!', 1),
    al('@', 6),
    am('#', 5),
    an('$', 5),
    ao('%', 5),
    ap('^', 5),
    aq('&', 5),
    ar('*', 5),
    as('(', 4),
    at(')', 4),
    au('-', 5),
    av('_', 5),
    aw('+', 5),
    ax('=', 5),
    ay('{', 4),
    az('}', 4),
    aA('[', 3),
    aB(']', 3),
    aC(':', 1),
    aD(';', 1),
    aE('\"', 3),
    aF('\'', 1),
    aG('<', 4),
    aH('>', 4),
    aI('?', 5),
    aJ('/', 5),
    aK('\\', 5),
    aL('|', 1),
    aM('~', 5),
    aN('`', 2),
    aO('.', 1),
    aP(',', 1),
    aQ(' ', 3),
    aR(' ', 1),
    aS('a', 4);

    private final char displayedChar;
    private final int displayedCharLength;

    DisplayedCharLength(char displayedChar, int displayedCharLength) {
        this.displayedChar = displayedChar;
        this.displayedCharLength = displayedCharLength;
    }

    private static DisplayedCharLength search(char displayedChar) {
        for (DisplayedCharLength value : values()) {
            if (displayedChar == value.displayedChar) {
                return value;
            }
        }
        return DisplayedCharLength.aS;
    }

    public static int getLength(String string) {
        int length = string.length();
        int n = 0;
        for (int i = 0; i < length; i++) {
            n += search(string.charAt(i)).displayedCharLength;
        }
        return n + aR.displayedCharLength * (length - 1);
    }

}package domini.util;

public enum DisplayedCharLength {

    a('A', 5),
    b('a', 5),
    c('B', 5),
    d('b', 5),
    e('C', 5),
    f('c', 5),
    g('D', 5),
    h('d', 5),
    i('E', 5),
    j('e', 5),
    k('F', 5),
    l('f', 4),
    m('G', 5),
    n('g', 5),
    o('H', 5),
    p('h', 5),
    q('I', 3),
    r('i', 1),
    s('J', 5),
    t('j', 5),
    u('K', 5),
    v('k', 4),
    w('L', 5),
    x('l', 2),
    y('M', 5),
    z('m', 5),
    A('N', 5),
    B('n', 5),
    C('O', 5),
    D('o', 5),
    E('P', 5),
    F('p', 5),
    G('Q', 5),
    H('q', 5),
    I('R', 5),
    J('r', 5),
    K('S', 5),
    L('s', 5),
    M('T', 5),
    N('t', 4),
    O('U', 5),
    P('u', 5),
    Q('V', 5),
    R('v', 5),
    S('W', 5),
    T('w', 5),
    U('X', 5),
    V('x', 5),
    W('Y', 5),
    X('y', 5),
    Y('Z', 5),
    Z('z', 5),
    aa('1', 5),
    ab('2', 5),
    ac('3', 5),
    ad('4', 5),
    ae('5', 5),
    af('6', 5),
    ag('7', 5),
    ah('8', 5),
    ai('9', 5),
    aj('0', 5),
    ak('!', 1),
    al('@', 6),
    am('#', 5),
    an('$', 5),
    ao('%', 5),
    ap('^', 5),
    aq('&', 5),
    ar('*', 5),
    as('(', 4),
    at(')', 4),
    au('-', 5),
    av('_', 5),
    aw('+', 5),
    ax('=', 5),
    ay('{', 4),
    az('}', 4),
    aA('[', 3),
    aB(']', 3),
    aC(':', 1),
    aD(';', 1),
    aE('\"', 3),
    aF('\'', 1),
    aG('<', 4),
    aH('>', 4),
    aI('?', 5),
    aJ('/', 5),
    aK('\\', 5),
    aL('|', 1),
    aM('~', 5),
    aN('`', 2),
    aO('.', 1),
    aP(',', 1),
    aQ(' ', 3),
    aR(' ', 1),
    aS('a', 4);

    private final char displayedChar;
    private final int displayedCharLength;

    DisplayedCharLength(char displayedChar, int displayedCharLength) {
        this.displayedChar = displayedChar;
        this.displayedCharLength = displayedCharLength;
    }

    private static DisplayedCharLength search(char displayedChar) {
        for (DisplayedCharLength value : values()) {
            if (displayedChar == value.displayedChar) {
                return value;
            }
        }
        return DisplayedCharLength.aS;
    }

    public static int getLength(String string) {
        int length = string.length();
        int n = 0;
        for (int i = 0; i < length; i++) {
            n += search(string.charAt(i)).displayedCharLength;
        }
        return n + aR.displayedCharLength * (length - 1);
    }

}