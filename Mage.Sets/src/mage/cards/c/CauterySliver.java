package mage.cards.c;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.costs.common.SacrificeSourceCost;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.DamageTargetEffect;
import mage.abilities.effects.common.PreventDamageToTargetEffect;
import mage.abilities.effects.common.continuous.GainAbilityAllEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;
import mage.constants.Zone;
import mage.filter.FilterPermanent;
import mage.filter.common.FilterCreaturePlayerOrPlaneswalker;
import mage.target.common.TargetAnyTarget;

import java.util.UUID;

/**
 * @author anonymous
 */
public final class CauterySliver extends CardImpl {

    private static final FilterPermanent filter = new FilterPermanent(SubType.SLIVER, "All Slivers");

    public CauterySliver(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{R}{W}");
        this.subtype.add(SubType.SLIVER);
        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        // All Slivers have "{1}, Sacrifice this permanent: This permanent deals 1 damage to any target."
        Ability ability1 = new SimpleActivatedAbility(Zone.BATTLEFIELD, new DamageTargetEffect(1), new ManaCostsImpl("1"));
        ability1.addCost(new SacrificeSourceCost());
        ability1.addTarget(new TargetAnyTarget());
        this.addAbility(new SimpleStaticAbility(Zone.BATTLEFIELD,
                new GainAbilityAllEffect(ability1, Duration.WhileOnBattlefield, filter,
                        "All Slivers have \"{1}, Sacrifice this permanent: This permanent deals 1 damage to any target.\"")));

        // All Slivers have "{1}, Sacrifice this permanent: Prevent the next 1 damage that would be dealt to target Sliver creature or player this turn."
        // All Slivers have "{1}, Sacrifice this permanent: Prevent the next 1 damage that would be dealt to target player, planeswalker, or Sliver creature this turn."
        Ability ability2 = new SimpleActivatedAbility(Zone.BATTLEFIELD, new PreventDamageToTargetEffect(Duration.EndOfTurn, 1), new ManaCostsImpl("1"));
        ability2.addCost(new SacrificeSourceCost());
        ability2.addTarget(new TargetAnyTarget(new FilterCreatureOrPlayerByType(SubType.SLIVER, "Sliver creature or player")));
        this.addAbility(new SimpleStaticAbility(Zone.BATTLEFIELD,
                new GainAbilityAllEffect(ability2, Duration.WhileOnBattlefield, filter,
                        "All Slivers have \"{1}, Sacrifice this permanent: Prevent the next 1 damage that would be dealt to target Sliver creature or player this turn.\"")));
    }

    private CauterySliver(final CauterySliver card) {
        super(card);
    }

    @Override
    public CauterySliver copy() {
        return new CauterySliver(this);
    }
}

class FilterCreatureOrPlayerByType extends FilterCreaturePlayerOrPlaneswalker {

    public FilterCreatureOrPlayerByType(SubType subType, String name) {
        super(name);
        this.getPermanentFilter().add(subType.getPredicate());
    }
}
