package evonyproxy.common.server.events;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.common.ASObjectable;
import flex.messaging.io.ArrayCollection;

/**
* @version .02
* @author Michael Archibald
*/
public class QuestFinished implements ASObjectable {
public Integer finishedQuest = null;

public QuestFinished(ASObject aso) {

if(aso.get("finishedQuest") != null) {
this.finishedQuest = (Integer) aso.get("finishedQuest");
}
}

public QuestFinished() {
}

@Override
public QuestFinished clone() {
QuestFinished clone = new QuestFinished();

if(this.finishedQuest != null) {
clone.setFinishedQuest(this.finishedQuest);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.finishedQuest != null) {
aso.put("finishedQuest", finishedQuest);
}

return aso;
}

public Integer getFinishedQuest() {
return finishedQuest;
}

public void setFinishedQuest(Integer finishedQuest) {
this.finishedQuest = finishedQuest;
}
}
