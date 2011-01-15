package evonyproxy.common.beans;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.common.ASObjectable;
import flex.messaging.io.ArrayCollection;

/**
* @version .02
* @author Michael Archibald
*/
public class BettleResultBean implements ASObjectable {

public BettleResultBean(ASObject aso) {
}

public BettleResultBean() {
}

@Override
public BettleResultBean clone() {
BettleResultBean clone = new BettleResultBean();

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

return aso;
}
}
