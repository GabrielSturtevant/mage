
package mage.cards.b;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.common.AttacksTriggeredAbility;
import mage.abilities.dynamicvalue.common.PermanentsOnBattlefieldCount;
import mage.abilities.dynamicvalue.common.StaticValue;
import mage.abilities.effects.common.continuous.BoostSourceEffect;
import mage.abilities.keyword.TrampleAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;
import mage.filter.common.FilterAttackingCreature;
import mage.filter.predicate.permanent.AnotherPredicate;

/**
 *
 * @author LoneFox
 */
public final class BullAurochs extends CardImpl {

    private static final FilterAttackingCreature filter = new FilterAttackingCreature("other attacking Aurochs");

    static {
        filter.add(SubType.AUROCHS.getPredicate());
        filter.add(AnotherPredicate.instance);
    }

    public BullAurochs(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.CREATURE},"{1}{G}");
        this.subtype.add(SubType.AUROCHS);
        this.power = new MageInt(2);
        this.toughness = new MageInt(1);

        // Trample
        this.addAbility(TrampleAbility.getInstance());
        // Whenever Bull Aurochs attacks, it gets +1/+0 until end of turn for each other attacking Aurochs.
        PermanentsOnBattlefieldCount value = new PermanentsOnBattlefieldCount(filter, 1);
        this.addAbility(new AttacksTriggeredAbility(new BoostSourceEffect(value, StaticValue.get(0), Duration.EndOfTurn, true), false));
    }

    private BullAurochs(final BullAurochs card) {
        super(card);
    }

    @Override
    public BullAurochs copy() {
        return new BullAurochs(this);
    }
}
