package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author LevelX2
 */
public final class Conspiracy extends ExpansionSet {

    private static final Conspiracy instance = new Conspiracy();

    public static Conspiracy getInstance() {
        return instance;
    }

    private Conspiracy() {
        super("Conspiracy", "CNS", ExpansionSet.buildDate(2014, 6, 6), SetType.SUPPLEMENTAL);
        this.blockName = "Conspiracy";
        this.hasBasicLands = false;
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;
        cards.add(new SetCardInfo("Academy Elite", 20, Rarity.RARE, mage.cards.a.AcademyElite.class));
        cards.add(new SetCardInfo("Aether Tradewinds", 89, Rarity.COMMON, mage.cards.a.AetherTradewinds.class));
        cards.add(new SetCardInfo("Agent of Acquisitions", 54, Rarity.UNCOMMON, mage.cards.a.AgentOfAcquisitions.class)); // draftmatters ability not implemented
        cards.add(new SetCardInfo("Air Servant", 90, Rarity.UNCOMMON, mage.cards.a.AirServant.class));
        cards.add(new SetCardInfo("Ajani's Sunstriker", 66, Rarity.COMMON, mage.cards.a.AjanisSunstriker.class));
        cards.add(new SetCardInfo("Altar of Dementia", 196, Rarity.RARE, mage.cards.a.AltarOfDementia.class));
        cards.add(new SetCardInfo("Altar's Reap", 112, Rarity.COMMON, mage.cards.a.AltarsReap.class));
        cards.add(new SetCardInfo("Apex Hawks", 67, Rarity.COMMON, mage.cards.a.ApexHawks.class));
        cards.add(new SetCardInfo("Assassinate", 113, Rarity.COMMON, mage.cards.a.Assassinate.class));
        cards.add(new SetCardInfo("Barbed Shocker", 136, Rarity.UNCOMMON, mage.cards.b.BarbedShocker.class));
        cards.add(new SetCardInfo("Basandra, Battle Seraph", 184, Rarity.RARE, mage.cards.b.BasandraBattleSeraph.class));
        cards.add(new SetCardInfo("Bite of the Black Rose", 26, Rarity.UNCOMMON, mage.cards.b.BiteOfTheBlackRose.class));
        cards.add(new SetCardInfo("Boldwyr Intimidator", 137, Rarity.UNCOMMON, mage.cards.b.BoldwyrIntimidator.class));
        cards.add(new SetCardInfo("Brago's Representative", 14, Rarity.COMMON, mage.cards.b.BragosRepresentative.class));
        cards.add(new SetCardInfo("Brago, King Eternal", 41, Rarity.RARE, mage.cards.b.BragoKingEternal.class));
        cards.add(new SetCardInfo("Brainstorm", 91, Rarity.COMMON, mage.cards.b.Brainstorm.class));
        cards.add(new SetCardInfo("Breakthrough", 92, Rarity.UNCOMMON, mage.cards.b.Breakthrough.class));
        cards.add(new SetCardInfo("Brimstone Volley", 138, Rarity.COMMON, mage.cards.b.BrimstoneVolley.class));
        cards.add(new SetCardInfo("Canal Dredger", 55, Rarity.RARE, mage.cards.c.CanalDredger.class));
        cards.add(new SetCardInfo("Charging Rhino", 159, Rarity.COMMON, mage.cards.c.ChargingRhino.class));
        cards.add(new SetCardInfo("Chartooth Cougar", 139, Rarity.COMMON, mage.cards.c.ChartoothCougar.class));
        cards.add(new SetCardInfo("Cinder Wall", 140, Rarity.COMMON, mage.cards.c.CinderWall.class));
        cards.add(new SetCardInfo("Coercive Portal", 56, Rarity.MYTHIC, mage.cards.c.CoercivePortal.class));
        cards.add(new SetCardInfo("Cogwork Librarian", 58, Rarity.COMMON, mage.cards.c.CogworkLibrarian.class)); // draftmatters ability not implemented
        cards.add(new SetCardInfo("Cogwork Spy", 59, Rarity.COMMON, mage.cards.c.CogworkSpy.class)); // draftmatters ability not implemented
        cards.add(new SetCardInfo("Compulsive Research", 93, Rarity.COMMON, mage.cards.c.CompulsiveResearch.class));
        cards.add(new SetCardInfo("Copperhorn Scout", 160, Rarity.COMMON, mage.cards.c.CopperhornScout.class));
        cards.add(new SetCardInfo("Council Guardian", 15, Rarity.UNCOMMON, mage.cards.c.CouncilGuardian.class));
        cards.add(new SetCardInfo("Council's Judgment", 16, Rarity.RARE, mage.cards.c.CouncilsJudgment.class));
        cards.add(new SetCardInfo("Courier Hawk", 68, Rarity.COMMON, mage.cards.c.CourierHawk.class));
        cards.add(new SetCardInfo("Crookclaw Transmuter", 94, Rarity.COMMON, mage.cards.c.CrookclawTransmuter.class));
        cards.add(new SetCardInfo("Custodi Soulbinders", 17, Rarity.RARE, mage.cards.c.CustodiSoulbinders.class));
        cards.add(new SetCardInfo("Custodi Squire", 18, Rarity.COMMON, mage.cards.c.CustodiSquire.class));
        cards.add(new SetCardInfo("Dack Fayden", 42, Rarity.MYTHIC, mage.cards.d.DackFayden.class));
        cards.add(new SetCardInfo("Dack's Duplicate", 43, Rarity.RARE, mage.cards.d.DacksDuplicate.class));
        cards.add(new SetCardInfo("Deal Broker", 61, Rarity.RARE, mage.cards.d.DealBroker.class)); // draftmatters ability not implemented
        cards.add(new SetCardInfo("Deathforge Shaman", 141, Rarity.UNCOMMON, mage.cards.d.DeathforgeShaman.class));
        cards.add(new SetCardInfo("Deathreap Ritual", 44, Rarity.UNCOMMON, mage.cards.d.DeathreapRitual.class));
        cards.add(new SetCardInfo("Deathrender", 197, Rarity.RARE, mage.cards.d.Deathrender.class));
        cards.add(new SetCardInfo("Decimate", 185, Rarity.RARE, mage.cards.d.Decimate.class));
        cards.add(new SetCardInfo("Dimir Doppelganger", 186, Rarity.RARE, mage.cards.d.DimirDoppelganger.class));
        cards.add(new SetCardInfo("Doomed Traveler", 69, Rarity.COMMON, mage.cards.d.DoomedTraveler.class));
        cards.add(new SetCardInfo("Drakestown Forgotten", 27, Rarity.RARE, mage.cards.d.DrakestownForgotten.class));
        cards.add(new SetCardInfo("Dream Fracture", 95, Rarity.COMMON, mage.cards.d.DreamFracture.class));
        cards.add(new SetCardInfo("Echoing Courage", 161, Rarity.COMMON, mage.cards.e.EchoingCourage.class));
        cards.add(new SetCardInfo("Edric, Spymaster of Trest", 187, Rarity.RARE, mage.cards.e.EdricSpymasterOfTrest.class));
        cards.add(new SetCardInfo("Elephant Guide", 162, Rarity.UNCOMMON, mage.cards.e.ElephantGuide.class));
        cards.add(new SetCardInfo("Elvish Aberration", 163, Rarity.COMMON, mage.cards.e.ElvishAberration.class));
        cards.add(new SetCardInfo("Enclave Elite", 96, Rarity.COMMON, mage.cards.e.EnclaveElite.class));
        cards.add(new SetCardInfo("Enraged Revolutionary", 31, Rarity.COMMON, mage.cards.e.EnragedRevolutionary.class));
        cards.add(new SetCardInfo("Exploration", 164, Rarity.RARE, mage.cards.e.Exploration.class));
        cards.add(new SetCardInfo("Explorer's Scope", 198, Rarity.UNCOMMON, mage.cards.e.ExplorersScope.class));
        cards.add(new SetCardInfo("Extract from Darkness", 45, Rarity.UNCOMMON, mage.cards.e.ExtractFromDarkness.class));
        cards.add(new SetCardInfo("Fact or Fiction", 97, Rarity.UNCOMMON, mage.cards.f.FactOrFiction.class));
        cards.add(new SetCardInfo("Favorable Winds", 98, Rarity.UNCOMMON, mage.cards.f.FavorableWinds.class));
        cards.add(new SetCardInfo("Fireshrieker", 199, Rarity.UNCOMMON, mage.cards.f.Fireshrieker.class));
        cards.add(new SetCardInfo("Fires of Yavimaya", 188, Rarity.UNCOMMON, mage.cards.f.FiresOfYavimaya.class));
        cards.add(new SetCardInfo("Flamewright", 46, Rarity.UNCOMMON, mage.cards.f.Flamewright.class));
        cards.add(new SetCardInfo("Flaring Flame-Kin", 142, Rarity.UNCOMMON, mage.cards.f.FlaringFlameKin.class));
        cards.add(new SetCardInfo("Flowstone Blade", 143, Rarity.COMMON, mage.cards.f.FlowstoneBlade.class));
        cards.add(new SetCardInfo("Galvanic Juggernaut", 200, Rarity.UNCOMMON, mage.cards.g.GalvanicJuggernaut.class));
        cards.add(new SetCardInfo("Gamekeeper", 165, Rarity.UNCOMMON, mage.cards.g.Gamekeeper.class));
        cards.add(new SetCardInfo("Glimmerpoint Stag", 70, Rarity.UNCOMMON, mage.cards.g.GlimmerpointStag.class));
        cards.add(new SetCardInfo("Gnarlid Pack", 166, Rarity.COMMON, mage.cards.g.GnarlidPack.class));
        cards.add(new SetCardInfo("Grenzo, Dungeon Warden", 47, Rarity.RARE, mage.cards.g.GrenzoDungeonWarden.class));
        cards.add(new SetCardInfo("Grenzo's Cutthroat", 32, Rarity.COMMON, mage.cards.g.GrenzosCutthroat.class));
        cards.add(new SetCardInfo("Grixis Illusionist", 99, Rarity.COMMON, mage.cards.g.GrixisIllusionist.class));
        cards.add(new SetCardInfo("Grudge Keeper", 28, Rarity.COMMON, mage.cards.g.GrudgeKeeper.class));
        cards.add(new SetCardInfo("Guardian Zendikon", 71, Rarity.COMMON, mage.cards.g.GuardianZendikon.class));
        cards.add(new SetCardInfo("Heartless Hidetsugu", 144, Rarity.RARE, mage.cards.h.HeartlessHidetsugu.class));
        cards.add(new SetCardInfo("Heckling Fiends", 145, Rarity.UNCOMMON, mage.cards.h.HecklingFiends.class));
        cards.add(new SetCardInfo("Howling Wolf", 167, Rarity.COMMON, mage.cards.h.HowlingWolf.class));
        cards.add(new SetCardInfo("Hunger of the Howlpack", 168, Rarity.COMMON, mage.cards.h.HungerOfTheHowlpack.class));
        cards.add(new SetCardInfo("Hydra Omnivore", 169, Rarity.MYTHIC, mage.cards.h.HydraOmnivore.class));
        cards.add(new SetCardInfo("Ignition Team", 34, Rarity.RARE, mage.cards.i.IgnitionTeam.class));
        cards.add(new SetCardInfo("Ill-Gotten Gains", 114, Rarity.RARE, mage.cards.i.IllGottenGains.class));
        cards.add(new SetCardInfo("Infectious Horror", 115, Rarity.COMMON, mage.cards.i.InfectiousHorror.class));
        cards.add(new SetCardInfo("Intangible Virtue", 72, Rarity.UNCOMMON, mage.cards.i.IntangibleVirtue.class));
        cards.add(new SetCardInfo("Jetting Glasskite", 100, Rarity.UNCOMMON, mage.cards.j.JettingGlasskite.class));
        cards.add(new SetCardInfo("Kor Chant", 73, Rarity.COMMON, mage.cards.k.KorChant.class));
        cards.add(new SetCardInfo("Lead the Stampede", 170, Rarity.UNCOMMON, mage.cards.l.LeadTheStampede.class));
        cards.add(new SetCardInfo("Liliana's Specter", 116, Rarity.COMMON, mage.cards.l.LilianasSpecter.class));
        cards.add(new SetCardInfo("Lizard Warrior", 146, Rarity.COMMON, mage.cards.l.LizardWarrior.class));
        cards.add(new SetCardInfo("Lore Seeker", 62, Rarity.RARE, mage.cards.l.LoreSeeker.class)); // draftmatters ability not implemented
        cards.add(new SetCardInfo("Magister of Worth", 48, Rarity.RARE, mage.cards.m.MagisterOfWorth.class));
        cards.add(new SetCardInfo("Magus of the Mirror", 117, Rarity.RARE, mage.cards.m.MagusOfTheMirror.class));
        cards.add(new SetCardInfo("Mana Geyser", 147, Rarity.COMMON, mage.cards.m.ManaGeyser.class));
        cards.add(new SetCardInfo("Marchesa's Emissary", 21, Rarity.COMMON, mage.cards.m.MarchesasEmissary.class));
        cards.add(new SetCardInfo("Marchesa's Infiltrator", 22, Rarity.UNCOMMON, mage.cards.m.MarchesasInfiltrator.class));
        cards.add(new SetCardInfo("Marchesa's Smuggler", 50, Rarity.UNCOMMON, mage.cards.m.MarchesasSmuggler.class));
        cards.add(new SetCardInfo("Marchesa, the Black Rose", 49, Rarity.MYTHIC, mage.cards.m.MarchesaTheBlackRose.class));
        cards.add(new SetCardInfo("Minamo Scrollkeeper", 101, Rarity.COMMON, mage.cards.m.MinamoScrollkeeper.class));
        cards.add(new SetCardInfo("Mirari's Wake", 189, Rarity.MYTHIC, mage.cards.m.MirarisWake.class));
        cards.add(new SetCardInfo("Mirrodin's Core", 208, Rarity.UNCOMMON, mage.cards.m.MirrodinsCore.class));
        cards.add(new SetCardInfo("Misdirection", 102, Rarity.RARE, mage.cards.m.Misdirection.class));
        cards.add(new SetCardInfo("Moment of Heroism", 74, Rarity.COMMON, mage.cards.m.MomentOfHeroism.class));
        cards.add(new SetCardInfo("Morkrut Banshee", 118, Rarity.UNCOMMON, mage.cards.m.MorkrutBanshee.class));
        cards.add(new SetCardInfo("Mortify", 190, Rarity.UNCOMMON, mage.cards.m.Mortify.class));
        cards.add(new SetCardInfo("Muzzio, Visionary Architect", 23, Rarity.MYTHIC, mage.cards.m.MuzzioVisionaryArchitect.class));
        cards.add(new SetCardInfo("Nature's Claim", 171, Rarity.COMMON, mage.cards.n.NaturesClaim.class));
        cards.add(new SetCardInfo("Necromantic Thirst", 119, Rarity.COMMON, mage.cards.n.NecromanticThirst.class));
        cards.add(new SetCardInfo("Noble Templar", 75, Rarity.COMMON, mage.cards.n.NobleTemplar.class));
        cards.add(new SetCardInfo("Orcish Cannonade", 148, Rarity.COMMON, mage.cards.o.OrcishCannonade.class));
        cards.add(new SetCardInfo("Peace Strider", 201, Rarity.UNCOMMON, mage.cards.p.PeaceStrider.class));
        cards.add(new SetCardInfo("Pelakka Wurm", 172, Rarity.UNCOMMON, mage.cards.p.PelakkaWurm.class));
        cards.add(new SetCardInfo("Pernicious Deed", 191, Rarity.MYTHIC, mage.cards.p.PerniciousDeed.class));
        cards.add(new SetCardInfo("Phage the Untouchable", 120, Rarity.MYTHIC, mage.cards.p.PhageTheUntouchable.class));
        cards.add(new SetCardInfo("Pillarfield Ox", 76, Rarity.COMMON, mage.cards.p.PillarfieldOx.class));
        cards.add(new SetCardInfo("Pitchburn Devils", 149, Rarity.COMMON, mage.cards.p.PitchburnDevils.class));
        cards.add(new SetCardInfo("Plagued Rusalka", 121, Rarity.UNCOMMON, mage.cards.p.PlaguedRusalka.class));
        cards.add(new SetCardInfo("Plated Seastrider", 103, Rarity.COMMON, mage.cards.p.PlatedSeastrider.class));
        cards.add(new SetCardInfo("Plea for Power", 24, Rarity.RARE, mage.cards.p.PleaForPower.class));
        cards.add(new SetCardInfo("Plummet", 173, Rarity.COMMON, mage.cards.p.Plummet.class));
        cards.add(new SetCardInfo("Power of Fire", 150, Rarity.COMMON, mage.cards.p.PowerOfFire.class));
        cards.add(new SetCardInfo("Predator's Howl", 37, Rarity.UNCOMMON, mage.cards.p.PredatorsHowl.class));
        cards.add(new SetCardInfo("Pride Guardian", 77, Rarity.COMMON, mage.cards.p.PrideGuardian.class));
        cards.add(new SetCardInfo("Pristine Angel", 78, Rarity.MYTHIC, mage.cards.p.PristineAngel.class));
        cards.add(new SetCardInfo("Provoke", 174, Rarity.COMMON, mage.cards.p.Provoke.class));
        cards.add(new SetCardInfo("Quag Vampires", 122, Rarity.COMMON, mage.cards.q.QuagVampires.class));
        cards.add(new SetCardInfo("Quicksand", 209, Rarity.UNCOMMON, mage.cards.q.Quicksand.class));
        cards.add(new SetCardInfo("Realm Seekers", 38, Rarity.RARE, mage.cards.r.RealmSeekers.class));
        cards.add(new SetCardInfo("Reckless Scholar", 104, Rarity.COMMON, mage.cards.r.RecklessScholar.class));
        cards.add(new SetCardInfo("Reckless Spite", 123, Rarity.UNCOMMON, mage.cards.r.RecklessSpite.class));
        cards.add(new SetCardInfo("Reflecting Pool", 210, Rarity.RARE, mage.cards.r.ReflectingPool.class));
        cards.add(new SetCardInfo("Reign of the Pit", 29, Rarity.RARE, mage.cards.r.ReignOfThePit.class));
        cards.add(new SetCardInfo("Reito Lantern", 202, Rarity.UNCOMMON, mage.cards.r.ReitoLantern.class));
        cards.add(new SetCardInfo("Relic Crush", 175, Rarity.UNCOMMON, mage.cards.r.RelicCrush.class));
        cards.add(new SetCardInfo("Respite", 176, Rarity.COMMON, mage.cards.r.Respite.class));
        cards.add(new SetCardInfo("Reya Dawnbringer", 79, Rarity.RARE, mage.cards.r.ReyaDawnbringer.class));
        cards.add(new SetCardInfo("Rousing of Souls", 19, Rarity.COMMON, mage.cards.r.RousingOfSouls.class));
        cards.add(new SetCardInfo("Rout", 80, Rarity.RARE, mage.cards.r.Rout.class));
        cards.add(new SetCardInfo("Runed Servitor", 203, Rarity.UNCOMMON, mage.cards.r.RunedServitor.class));
        cards.add(new SetCardInfo("Sakura-Tribe Elder", 177, Rarity.COMMON, mage.cards.s.SakuraTribeElder.class));
        cards.add(new SetCardInfo("Scaled Wurm", 178, Rarity.COMMON, mage.cards.s.ScaledWurm.class));
        cards.add(new SetCardInfo("Scourge of the Throne", 35, Rarity.MYTHIC, mage.cards.s.ScourgeOfTheThrone.class));
        cards.add(new SetCardInfo("Screaming Seahawk", 105, Rarity.COMMON, mage.cards.s.ScreamingSeahawk.class));
        cards.add(new SetCardInfo("Selvala, Explorer Returned", 51, Rarity.RARE, mage.cards.s.SelvalaExplorerReturned.class));
        cards.add(new SetCardInfo("Selvala's Charge", 39, Rarity.UNCOMMON, mage.cards.s.SelvalasCharge.class));
        cards.add(new SetCardInfo("Selvala's Enforcer", 40, Rarity.COMMON, mage.cards.s.SelvalasEnforcer.class));
        cards.add(new SetCardInfo("Shoreline Ranger", 106, Rarity.COMMON, mage.cards.s.ShorelineRanger.class));
        cards.add(new SetCardInfo("Silent Arbiter", 204, Rarity.RARE, mage.cards.s.SilentArbiter.class));
        cards.add(new SetCardInfo("Silverchase Fox", 81, Rarity.COMMON, mage.cards.s.SilverchaseFox.class));
        cards.add(new SetCardInfo("Skeletal Scrying", 124, Rarity.UNCOMMON, mage.cards.s.SkeletalScrying.class));
        cards.add(new SetCardInfo("Skitter of Lizards", 151, Rarity.COMMON, mage.cards.s.SkitterOfLizards.class));
        cards.add(new SetCardInfo("Sky Spirit", 192, Rarity.UNCOMMON, mage.cards.s.SkySpirit.class));
        cards.add(new SetCardInfo("Smallpox", 125, Rarity.UNCOMMON, mage.cards.s.Smallpox.class));
        cards.add(new SetCardInfo("Soulcatcher", 82, Rarity.UNCOMMON, mage.cards.s.Soulcatcher.class));
        cards.add(new SetCardInfo("Spectral Searchlight", 205, Rarity.UNCOMMON, mage.cards.s.SpectralSearchlight.class));
        cards.add(new SetCardInfo("Spiritmonger", 193, Rarity.RARE, mage.cards.s.Spiritmonger.class));
        cards.add(new SetCardInfo("Split Decision", 25, Rarity.UNCOMMON, mage.cards.s.SplitDecision.class));
        cards.add(new SetCardInfo("Spontaneous Combustion", 194, Rarity.UNCOMMON, mage.cards.s.SpontaneousCombustion.class));
        cards.add(new SetCardInfo("Sporecap Spider", 179, Rarity.COMMON, mage.cards.s.SporecapSpider.class));
        cards.add(new SetCardInfo("Squirrel Nest", 180, Rarity.UNCOMMON, mage.cards.s.SquirrelNest.class));
        cards.add(new SetCardInfo("Stasis Cell", 107, Rarity.COMMON, mage.cards.s.StasisCell.class));
        cards.add(new SetCardInfo("Stave Off", 83, Rarity.COMMON, mage.cards.s.StaveOff.class));
        cards.add(new SetCardInfo("Stifle", 108, Rarity.RARE, mage.cards.s.Stifle.class));
        cards.add(new SetCardInfo("Stronghold Discipline", 126, Rarity.COMMON, mage.cards.s.StrongholdDiscipline.class));
        cards.add(new SetCardInfo("Sulfuric Vortex", 152, Rarity.RARE, mage.cards.s.SulfuricVortex.class));
        cards.add(new SetCardInfo("Swords to Plowshares", 84, Rarity.UNCOMMON, mage.cards.s.SwordsToPlowshares.class));
        cards.add(new SetCardInfo("Syphon Soul", 127, Rarity.COMMON, mage.cards.s.SyphonSoul.class));
        cards.add(new SetCardInfo("Terastodon", 181, Rarity.RARE, mage.cards.t.Terastodon.class));
        cards.add(new SetCardInfo("Torch Fiend", 153, Rarity.COMMON, mage.cards.t.TorchFiend.class));
        cards.add(new SetCardInfo("Tragic Slip", 128, Rarity.COMMON, mage.cards.t.TragicSlip.class));
        cards.add(new SetCardInfo("Traveler's Cloak", 109, Rarity.COMMON, mage.cards.t.TravelersCloak.class));
        cards.add(new SetCardInfo("Treasonous Ogre", 36, Rarity.UNCOMMON, mage.cards.t.TreasonousOgre.class));
        cards.add(new SetCardInfo("Trumpet Blast", 154, Rarity.COMMON, mage.cards.t.TrumpetBlast.class));
        cards.add(new SetCardInfo("Turn the Tide", 110, Rarity.COMMON, mage.cards.t.TurnTheTide.class));
        cards.add(new SetCardInfo("Twisted Abomination", 129, Rarity.COMMON, mage.cards.t.TwistedAbomination.class));
        cards.add(new SetCardInfo("Typhoid Rats", 130, Rarity.COMMON, mage.cards.t.TyphoidRats.class));
        cards.add(new SetCardInfo("Tyrant's Choice", 30, Rarity.COMMON, mage.cards.t.TyrantsChoice.class));
        cards.add(new SetCardInfo("Uncontrollable Anger", 155, Rarity.UNCOMMON, mage.cards.u.UncontrollableAnger.class));
        cards.add(new SetCardInfo("Unhallowed Pact", 131, Rarity.COMMON, mage.cards.u.UnhallowedPact.class));
        cards.add(new SetCardInfo("Unquestioned Authority", 85, Rarity.UNCOMMON, mage.cards.u.UnquestionedAuthority.class));
        cards.add(new SetCardInfo("Valor Made Real", 86, Rarity.COMMON, mage.cards.v.ValorMadeReal.class));
        cards.add(new SetCardInfo("Vampire Hexmage", 132, Rarity.UNCOMMON, mage.cards.v.VampireHexmage.class));
        cards.add(new SetCardInfo("Vedalken Orrery", 206, Rarity.RARE, mage.cards.v.VedalkenOrrery.class));
        cards.add(new SetCardInfo("Vent Sentinel", 156, Rarity.COMMON, mage.cards.v.VentSentinel.class));
        cards.add(new SetCardInfo("Victimize", 133, Rarity.UNCOMMON, mage.cards.v.Victimize.class));
        cards.add(new SetCardInfo("Volcanic Fallout", 157, Rarity.UNCOMMON, mage.cards.v.VolcanicFallout.class));
        cards.add(new SetCardInfo("Vow of Duty", 87, Rarity.UNCOMMON, mage.cards.v.VowOfDuty.class));
        cards.add(new SetCardInfo("Wakedancer", 134, Rarity.COMMON, mage.cards.w.Wakedancer.class));
        cards.add(new SetCardInfo("Wakestone Gargoyle", 88, Rarity.UNCOMMON, mage.cards.w.WakestoneGargoyle.class));
        cards.add(new SetCardInfo("Warmonger's Chariot", 207, Rarity.UNCOMMON, mage.cards.w.WarmongersChariot.class));
        cards.add(new SetCardInfo("Whispergear Sneak", 64, Rarity.COMMON, mage.cards.w.WhispergearSneak.class)); // draftmatters ability not implemented
        cards.add(new SetCardInfo("Wind Dancer", 111, Rarity.UNCOMMON, mage.cards.w.WindDancer.class));
        cards.add(new SetCardInfo("Wolfbriar Elemental", 182, Rarity.RARE, mage.cards.w.WolfbriarElemental.class));
        cards.add(new SetCardInfo("Wood Sage", 195, Rarity.UNCOMMON, mage.cards.w.WoodSage.class));
        cards.add(new SetCardInfo("Woodvine Elemental", 52, Rarity.UNCOMMON, mage.cards.w.WoodvineElemental.class));
        cards.add(new SetCardInfo("Wrap in Flames", 158, Rarity.COMMON, mage.cards.w.WrapInFlames.class));
        cards.add(new SetCardInfo("Wrap in Vigor", 183, Rarity.COMMON, mage.cards.w.WrapInVigor.class));
        cards.add(new SetCardInfo("Zombie Goliath", 135, Rarity.COMMON, mage.cards.z.ZombieGoliath.class));
    }

}
