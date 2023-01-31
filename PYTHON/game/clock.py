import pygame
import time
import math
pygame.init()

screen = pygame.display.set_mode((500,600))

GREY = (120,120,120)
WHITE = (255,255,255)
BLACK = (0,0,0)

running = True

font = pygame.font.SysFont('sans',50)
text_1 = font.render('+', True, BLACK)
text_2 = font.render('-', True, BLACK)
text_3 = font.render('+', True, BLACK)
text_4 = font.render('-', True, BLACK)
text_5 = font.render('Start', True, BLACK)
text_6 = font.render('Reset', True, BLACK)

while running:
	screen.fill(GREY)


	mouse_x, mouse_y = pygame.mouse.get_pos()

	pygame.draw.rect(screen, WHITE, (100,50,50,50))
	pygame.draw.rect(screen, WHITE, (100,200,50,50))
	pygame.draw.rect(screen, WHITE, (200,50,50,50))
	pygame.draw.rect(screen, WHITE, (200,200,50,50))
	pygame.draw.rect(screen, WHITE, (300,50,150,50))
	pygame.draw.rect(screen, WHITE, (300,50,150,50))
	pygame.draw.rect(screen, WHITE, (300,150,150,50))
	
	screen.blit(text_1, (100,50))
	screen.blit(text_2, (100,200))
	screen.blit(text_3, (200,50))
	screen.blit(text_4, (200,200))
	screen.blit(text_5, (300,50))
	screen.blit(text_6, (300,150))

	pygame.draw.rect(screen, BLACK, (50,520,400,50))
	pygame.draw.rect(screen, WHITE, (60,530,380,30))

	pygame.draw.circle(screen, BLACK, (250,400), 100)
	pygame.draw.circle(screen, WHITE, (250,400), 95)
	pygame.draw.circle(screen, BLACK, (250,400), 5)

	pygame.draw.line(screen, BLACK, (250,400), (250,310))

	for event in pygame.event.get():
		if event.type == pygame.QUIT:	
			running = False

	pygame.display.flip()

pygame.quit()