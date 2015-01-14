package com.dandy;

/**
 * Created by Adrien Gervais on 1/13/2015.
 */
public class Attack {
    private final Long dbID;
    private final Long characterID;
    private Integer characterLevel;
    private String attackName;
    private String attackingType;
    private String defendingType;
    private Integer attackAbilityMod;
    private Integer attackClassMod;
    private Integer attackProficiencyMod;
    private Integer attackFeatMod;
    private Integer attackEnhancementMod;
    private Integer attackMiscMod;

    private Integer damageAbilityMod;
    private Integer damageFeatMod;
    private Integer damageEnhancementMod;
    private Integer damageMiscMod;

    public Attack(final Long dbID, final Long characterID, final Integer characterLevel) {
        this.dbID = dbID;
        this.characterID = characterID;
        this.characterLevel = characterLevel;

        attackAbilityMod = 0;
        attackClassMod = 0;
        attackProficiencyMod = 0;
        attackFeatMod = 0;
        attackEnhancementMod = 0;
        attackMiscMod = 0;

        damageAbilityMod = 0;
        damageFeatMod = 0;
        damageEnhancementMod = 0;
        damageMiscMod = 0;
    }

    public Integer getAttackValue() {
        return new Double(Math.floor(characterLevel / 2.0)).intValue() + attackAbilityMod + attackClassMod + attackProficiencyMod + attackFeatMod + attackEnhancementMod + attackMiscMod;
    }

    public Long getCharacterID() {
        return characterID;
    }

    public Integer getCharacterLevel() {
        return characterLevel;
    }

    public void setCharacterLevel(Integer characterLevel) {
        this.characterLevel = characterLevel;
    }

    public String getAttackName() {
        return attackName;
    }

    public void setAttackName(String attackName) {
        this.attackName = attackName;
    }

    public String getAttackingType() {
        return attackingType;
    }

    public void setAttackingType(String attackingType) {
        this.attackingType = attackingType;
    }

    public String getDefendingType() {
        return defendingType;
    }

    public void setDefendingType(String defendingType) {
        this.defendingType = defendingType;
    }

    public Integer getAttackAbilityMod() {
        return attackAbilityMod;
    }

    public void setAttackAbilityMod(Integer attackAbilityMod) {
        this.attackAbilityMod = attackAbilityMod;
    }

    public Integer getAttackClassMod() {
        return attackClassMod;
    }

    public void setAttackClassMod(Integer attackClassMod) {
        this.attackClassMod = attackClassMod;
    }

    public Integer getAttackProficiencyMod() {
        return attackProficiencyMod;
    }

    public void setAttackProficiencyMod(Integer attackProficiencyMod) {
        this.attackProficiencyMod = attackProficiencyMod;
    }

    public Integer getAttackFeatMod() {
        return attackFeatMod;
    }

    public void setAttackFeatMod(Integer attackFeatMod) {
        this.attackFeatMod = attackFeatMod;
    }

    public Integer getAttackEnhancementMod() {
        return attackEnhancementMod;
    }

    public void setAttackEnhancementMod(Integer attackEnhancementMod) {
        this.attackEnhancementMod = attackEnhancementMod;
    }

    public Integer getAttackMiscMod() {
        return attackMiscMod;
    }

    public void setAttackMiscMod(Integer attackMiscMod) {
        this.attackMiscMod = attackMiscMod;
    }

    public Integer getDamageAbilityMod() {
        return damageAbilityMod;
    }

    public void setDamageAbilityMod(Integer damageAbilityMod) {
        this.damageAbilityMod = damageAbilityMod;
    }

    public Integer getDamageFeatMod() {
        return damageFeatMod;
    }

    public void setDamageFeatMod(Integer damageFeatMod) {
        this.damageFeatMod = damageFeatMod;
    }

    public Integer getDamageEnhancementMod() {
        return damageEnhancementMod;
    }

    public void setDamageEnhancementMod(Integer damageEnhancementMod) {
        this.damageEnhancementMod = damageEnhancementMod;
    }

    public Integer getDamageMiscMod() {
        return damageMiscMod;
    }

    public void setDamageMiscMod(Integer damageMiscMod) {
        this.damageMiscMod = damageMiscMod;
    }

    public Long getDbID() {

        return dbID;
    }

    public Integer getDamageValue() {
        return damageAbilityMod + damageFeatMod + damageEnhancementMod + damageMiscMod;
    }
}
