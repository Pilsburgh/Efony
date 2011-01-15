/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evonyproxy.command;

import evonyproxy.Sender;
import evonyproxy.Serializer;
import java.lang.reflect.Method;

/**
 * @version .01
 * @author Michael Archibald
 */
public class CmdFactory {
    protected AllianceCommands alliance;
    protected AllianceManagementCommands allianceManagement;
    protected ArmyCommands army;
    protected CapitalCommands capital;
    protected CastleCommands castle;
    protected CelebRankCommands celebRank;
    protected CityCommands city;
    protected ColonyCommands colony;
    protected CommissionQuestCommands commissionQuest;
    protected CommonCommands common;
    protected EquipmentCommands equipment;
    protected EquipmenttechCommands equipmentTech;
    protected FieldCommand field;
    protected FortificationsCommands fortifications;
    protected FriendCommands friend;
    protected FurloughCommands furlough;
    protected GamblingRankingCommands gamblingRanking;
    protected HeroCommand hero;
    protected InteriorCommands interior;
    protected MailCommands mail;
    protected ModifyCommands modify;
    protected NpcHeroCommand npcHero;
    protected QuestCommands quest;
    protected RankCommands rank;
    protected ReportCommands report;
    protected ShopCommands shop;
    protected StratagemCommands stratagem;
    protected TechCommand tech;
    protected TradeCommands trade;
    protected TroopCommands troop;
    protected TruceCommands truce;
    private static CmdFactory INSTANCE = new CmdFactory();

    public CmdFactory() {
        alliance = new AllianceCommands();
        allianceManagement = new AllianceManagementCommands();
        army = new ArmyCommands();
        capital = new CapitalCommands();
        castle = new CastleCommands();
        celebRank = new CelebRankCommands();
        city = new CityCommands();
        colony = new ColonyCommands();
        commissionQuest = new CommissionQuestCommands();
        common = new CommonCommands();
        equipment = new EquipmentCommands();
        equipmentTech = new EquipmenttechCommands();
        field = new FieldCommand();
        fortifications = new FortificationsCommands();
        friend = new FriendCommands();
        furlough = new FurloughCommands();
        gamblingRanking = new GamblingRankingCommands();
        hero = new HeroCommand();
        interior = new InteriorCommands();
        mail = new MailCommands();
        modify = new ModifyCommands();
        npcHero = new NpcHeroCommand();
        quest = new QuestCommands();
        rank = new RankCommands();
        report = new ReportCommands();
        shop = new ShopCommands();
        stratagem = new StratagemCommands();
        tech = new TechCommand();
        trade = new TradeCommands();
        troop = new TroopCommands();
        truce = new TruceCommands();
    }

    public void setSender(Sender sender) {
        alliance.setSender(sender);
        allianceManagement.setSender(sender);
        army.setSender(sender);
        capital.setSender(sender);
        castle.setSender(sender);
        celebRank.setSender(sender);
        city.setSender(sender);
        colony.setSender(sender);
        commissionQuest.setSender(sender);
        common.setSender(sender);
        equipment.setSender(sender);
        equipmentTech.setSender(sender);
        field.setSender(sender);
        fortifications.setSender(sender);
        friend.setSender(sender);
        furlough.setSender(sender);
        gamblingRanking.setSender(sender);
        hero.setSender(sender);
        interior.setSender(sender);
        mail.setSender(sender);
        modify.setSender(sender);
        npcHero.setSender(sender);
        quest.setSender(sender);
        rank.setSender(sender);
        report.setSender(sender);
        shop.setSender(sender);
        stratagem.setSender(sender);
        tech.setSender(sender);
        trade.setSender(sender);
        troop.setSender(sender);
        truce.setSender(sender);
    }

    public void setSerializer(Serializer serializer) {
        alliance.setSerializer(serializer);
        allianceManagement.setSerializer(serializer);
        army.setSerializer(serializer);
        capital.setSerializer(serializer);
        castle.setSerializer(serializer);
        celebRank.setSerializer(serializer);
        city.setSerializer(serializer);
        colony.setSerializer(serializer);
        commissionQuest.setSerializer(serializer);
        common.setSerializer(serializer);
        equipment.setSerializer(serializer);
        equipmentTech.setSerializer(serializer);
        field.setSerializer(serializer);
        fortifications.setSerializer(serializer);
        friend.setSerializer(serializer);
        furlough.setSerializer(serializer);
        gamblingRanking.setSerializer(serializer);
        hero.setSerializer(serializer);
        interior.setSerializer(serializer);
        mail.setSerializer(serializer);
        modify.setSerializer(serializer);
        npcHero.setSerializer(serializer);
        quest.setSerializer(serializer);
        rank.setSerializer(serializer);
        report.setSerializer(serializer);
        shop.setSerializer(serializer);
        stratagem.setSerializer(serializer);
        tech.setSerializer(serializer);
        trade.setSerializer(serializer);
        troop.setSerializer(serializer);
        truce.setSerializer(serializer);
    }

    public static CmdFactory getInstance() {
        return INSTANCE;
    }

    public AllianceCommands getAlliance() {
        return alliance;
    }

    public void setAlliance(AllianceCommands alliance) {
        this.alliance = alliance;
    }

    public AllianceManagementCommands getAllianceManagement() {
        return allianceManagement;
    }

    public void setAllianceManagement(AllianceManagementCommands allianceManagement) {
        this.allianceManagement = allianceManagement;
    }

    public ArmyCommands getArmy() {
        return army;
    }

    public void setArmy(ArmyCommands army) {
        this.army = army;
    }

    public CapitalCommands getCapital() {
        return capital;
    }

    public void setCapital(CapitalCommands capital) {
        this.capital = capital;
    }

    public CastleCommands getCastle() {
        return castle;
    }

    public void setCastle(CastleCommands castle) {
        this.castle = castle;
    }

    public CelebRankCommands getCelebRank() {
        return celebRank;
    }

    public void setCelebRank(CelebRankCommands celebRank) {
        this.celebRank = celebRank;
    }

    public CityCommands getCity() {
        return city;
    }

    public void setCity(CityCommands city) {
        this.city = city;
    }

    public ColonyCommands getColony() {
        return colony;
    }

    public void setColony(ColonyCommands colony) {
        this.colony = colony;
    }

    public CommissionQuestCommands getCommissionQuest() {
        return commissionQuest;
    }

    public void setCommissionQuest(CommissionQuestCommands commissionQuest) {
        this.commissionQuest = commissionQuest;
    }

    public CommonCommands getCommon() {
        return common;
    }

    public void setCommon(CommonCommands common) {
        this.common = common;
    }

    public EquipmentCommands getEquipment() {
        return equipment;
    }

    public void setEquipment(EquipmentCommands equipment) {
        this.equipment = equipment;
    }

    public EquipmenttechCommands getEquipmentTech() {
        return equipmentTech;
    }

    public void setEquipmentTech(EquipmenttechCommands equipmentTech) {
        this.equipmentTech = equipmentTech;
    }

    public FieldCommand getField() {
        return field;
    }

    public void setField(FieldCommand field) {
        this.field = field;
    }

    public FortificationsCommands getFortifications() {
        return fortifications;
    }

    public void setFortifications(FortificationsCommands fortifications) {
        this.fortifications = fortifications;
    }

    public FriendCommands getFriend() {
        return friend;
    }

    public void setFriend(FriendCommands friend) {
        this.friend = friend;
    }

    public FurloughCommands getFurlough() {
        return furlough;
    }

    public void setFurlough(FurloughCommands furlough) {
        this.furlough = furlough;
    }

    public GamblingRankingCommands getGamblingRanking() {
        return gamblingRanking;
    }

    public void setGamblingRanking(GamblingRankingCommands gamblingRanking) {
        this.gamblingRanking = gamblingRanking;
    }

    public HeroCommand getHero() {
        return hero;
    }

    public void setHero(HeroCommand hero) {
        this.hero = hero;
    }

    public InteriorCommands getInterior() {
        return interior;
    }

    public void setInterior(InteriorCommands interior) {
        this.interior = interior;
    }

    public MailCommands getMail() {
        return mail;
    }

    public void setMail(MailCommands mail) {
        this.mail = mail;
    }

    public ModifyCommands getModify() {
        return modify;
    }

    public void setModify(ModifyCommands modify) {
        this.modify = modify;
    }

    public NpcHeroCommand getNpcHero() {
        return npcHero;
    }

    public void setNpcHero(NpcHeroCommand npcHero) {
        this.npcHero = npcHero;
    }

    public QuestCommands getQuest() {
        return quest;
    }

    public void setQuest(QuestCommands quest) {
        this.quest = quest;
    }

    public RankCommands getRank() {
        return rank;
    }

    public void setRank(RankCommands rank) {
        this.rank = rank;
    }

    public ReportCommands getReport() {
        return report;
    }

    public void setReport(ReportCommands report) {
        this.report = report;
    }

    public ShopCommands getShop() {
        return shop;
    }

    public void setShop(ShopCommands shop) {
        this.shop = shop;
    }

    public StratagemCommands getStratagem() {
        return stratagem;
    }

    public void setStratagem(StratagemCommands stratagem) {
        this.stratagem = stratagem;
    }

    public TechCommand getTech() {
        return tech;
    }

    public void setTech(TechCommand tech) {
        this.tech = tech;
    }

    public TradeCommands getTrade() {
        return trade;
    }

    public void setTrade(TradeCommands trade) {
        this.trade = trade;
    }

    public TroopCommands getTroop() {
        return troop;
    }

    public void setTroop(TroopCommands troop) {
        this.troop = troop;
    }

    public TruceCommands getTruce() {
        return truce;
    }

    public void setTruce(TruceCommands truce) {
        this.truce = truce;
    }
}
