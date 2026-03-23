package actions

import resources.ResourceMenager
interface ModuleAction {
    fun execute(manager: ResourceMenager)
}