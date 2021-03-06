
package mage.cards.d;

import java.util.UUID;
import mage.abilities.effects.common.search.SearchLibraryPutInHandEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.target.common.TargetCardInLibrary;

/**
 *
 * @author KholdFuzion

 */
public final class DemonicTutor extends CardImpl {

    public DemonicTutor(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.SORCERY},"{1}{B}");


        // Search your library for a card and put that card into your hand. Then shuffle your library.
        TargetCardInLibrary target = new TargetCardInLibrary();
        this.getSpellAbility().addEffect(new SearchLibraryPutInHandEffect(target));
    }

    private DemonicTutor(final DemonicTutor card) {
        super(card);
    }

    @Override
    public DemonicTutor copy() {
        return new DemonicTutor(this);
    }
}
