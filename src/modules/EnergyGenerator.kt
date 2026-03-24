package modules

import resources.OutpostResource
import resources.ResourceMenager
import modules.OutpostModule
class EnergyGenerator : OutpostModule("Генератор энергии") {
    override fun performAction(manager: ResourceMenager) : ModuleResult {
        println("генератор работает... производит 20 энергии")
        val energy = manager.get("Energy")
        return if (energy != null) {
            energy.amount += 20
            ModuleResult.ResourceProduced("Enery", 20)
        } else {
            manager.add(OutpostResource(99, "Energy", 20))
            ModuleResult.Success("Энергия создана впервые")
        }
    }
}