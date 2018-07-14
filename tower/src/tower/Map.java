/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tower;

/**
 *
 * @author florian
 */
public class Map {
	public int width;
	public int height;
	public enum fieldType {
		EMPTY, OBSTACLE, SPAWN, HOME
	}

	public class Field {
		public fieldType type;
		public TowerObject tower;
		public EnemyObject[] enemies;

		public Field (fieldType type) {
			this.type = type;
		}
	}

	public Field[][] grid;

	public void initTest() {
		this.width = 10;
		this.height = 10;
		this.grid = new Field[10][10];
		for (int i = 0; i < this.width; i++) {
		for (int j = 0; j < this.height; j++) {
				this.grid[i][j] = new Field(fieldType.EMPTY);
			}
		}
	}
}
