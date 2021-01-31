package MyGame.Locations

import MyGame.Units.Enemy

open class  EnemyBase(array: Array<Enemy>) {

    fun <T> Set_Enemys (enemyList: MutableList<String>, enemyBase: EnemyBase){
        for (el in enemyList){
            enemysOnBase.add(el)
        }
    }

    companion object{
        private var enemysOnBase = mutableListOf<String>()
    }
}


