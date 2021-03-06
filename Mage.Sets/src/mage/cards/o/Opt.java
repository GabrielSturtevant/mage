
package mage.cards.o;

import java.util.UUID;
import mage.abilities.effects.common.DrawCardSourceControllerEffect;
import mage.abilities.effects.keyword.ScryEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

/**
 *
 * @author KholdFuzion
 */
public final class Opt extends CardImpl {

    public Opt(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.INSTANT},"{U}");

        // Scry 1.
        this.getSpellAbility().addEffect(new ScryEffect(1));
        
        // Draw a card.
        this.getSpellAbility().addEffect(new DrawCardSourceControllerEffect(1));
    }

    private Opt(final Opt card) {
        super(card);
    }

    @Override
    public Opt copy() {
        return new Opt(this);
    }
}
