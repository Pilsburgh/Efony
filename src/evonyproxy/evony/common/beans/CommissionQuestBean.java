package evonyproxy.evony.common.beans;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.evony.EvonyPacket;
import flex.messaging.io.ArrayCollection;

/**
 * @version .02
 * @author Michael Archibald
 */
public class CommissionQuestBean implements EvonyPacket {

    private Boolean isFinish = null;
    private Boolean isMyIssue = null;
    private Integer type = null;
    private String name = null;
    private Double timeout = null;
    private String position = null;
    private Integer id = null;
    private Boolean isAccepted = null;
    private Integer reward = null;
    private String endtime = null;
    private String target = null;
    private Integer playerCount = null;

    public CommissionQuestBean(ASObject aso) {

        if (aso.get("isFinish") != null) {
            this.isFinish = (Boolean) aso.get("isFinish");
        }

        if (aso.get("isMyIssue") != null) {
            this.isMyIssue = (Boolean) aso.get("isMyIssue");
        }

        if (aso.get("type") != null) {
            this.type = (Integer) aso.get("type");
        }

        if (aso.get("name") != null) {
            this.name = (String) aso.get("name");
        }

        if (aso.get("timeout") != null) {
            this.timeout = (Double) aso.get("timeout");
        }

        if (aso.get("position") != null) {
            this.position = (String) aso.get("position");
        }

        if (aso.get("id") != null) {
            this.id = (Integer) aso.get("id");
        }

        if (aso.get("isAccepted") != null) {
            this.isAccepted = (Boolean) aso.get("isAccepted");
        }

        if (aso.get("reward") != null) {
            this.reward = (Integer) aso.get("reward");
        }

        if (aso.get("endtime") != null) {
            this.endtime = (String) aso.get("endtime");
        }

        if (aso.get("target") != null) {
            this.target = (String) aso.get("target");
        }

        if (aso.get("playerCount") != null) {
            this.playerCount = (Integer) aso.get("playerCount");
        }
    }

    public CommissionQuestBean() {
    }

    @Override
    public CommissionQuestBean clone() {
        CommissionQuestBean clone = new CommissionQuestBean();

        if (this.isFinish != null) {
            clone.setIsFinish(this.isFinish);
        }

        if (this.isMyIssue != null) {
            clone.setIsMyIssue(this.isMyIssue);
        }

        if (this.type != null) {
            clone.setType(this.type);
        }

        if (this.name != null) {
            clone.setName(this.name);
        }

        if (this.timeout != null) {
            clone.setTimeout(this.timeout);
        }

        if (this.position != null) {
            clone.setPosition(this.position);
        }

        if (this.id != null) {
            clone.setId(this.id);
        }

        if (this.isAccepted != null) {
            clone.setIsAccepted(this.isAccepted);
        }

        if (this.reward != null) {
            clone.setReward(this.reward);
        }

        if (this.endtime != null) {
            clone.setEndtime(this.endtime);
        }

        if (this.target != null) {
            clone.setTarget(this.target);
        }

        if (this.playerCount != null) {
            clone.setPlayerCount(this.playerCount);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.isFinish != null) {
            aso.put("isFinish", isFinish);
        }

        if (this.isMyIssue != null) {
            aso.put("isMyIssue", isMyIssue);
        }

        if (this.type != null) {
            aso.put("type", type);
        }

        if (this.name != null) {
            aso.put("name", name);
        }

        if (this.timeout != null) {
            aso.put("timeout", timeout);
        }

        if (this.position != null) {
            aso.put("position", position);
        }

        if (this.id != null) {
            aso.put("id", id);
        }

        if (this.isAccepted != null) {
            aso.put("isAccepted", isAccepted);
        }

        if (this.reward != null) {
            aso.put("reward", reward);
        }

        if (this.endtime != null) {
            aso.put("endtime", endtime);
        }

        if (this.target != null) {
            aso.put("target", target);
        }

        if (this.playerCount != null) {
            aso.put("playerCount", playerCount);
        }

        return aso;
    }

    public Boolean getIsFinish() {
        return isFinish;
    }

    public void setIsFinish(Boolean isFinish) {
        this.isFinish = isFinish;
    }

    public Boolean getIsMyIssue() {
        return isMyIssue;
    }

    public void setIsMyIssue(Boolean isMyIssue) {
        this.isMyIssue = isMyIssue;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getTimeout() {
        return timeout;
    }

    public void setTimeout(Double timeout) {
        this.timeout = timeout;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIsAccepted() {
        return isAccepted;
    }

    public void setIsAccepted(Boolean isAccepted) {
        this.isAccepted = isAccepted;
    }

    public Integer getReward() {
        return reward;
    }

    public void setReward(Integer reward) {
        this.reward = reward;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Integer getPlayerCount() {
        return playerCount;
    }

    public void setPlayerCount(Integer playerCount) {
        this.playerCount = playerCount;
    }
}
