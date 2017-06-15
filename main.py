import numpy
import math
# The words ”A point (a vector) is given” mean that its coordinates (components) are given.
# The words ”A line is given” mean that its equation is given. You can use as an input either equation of the line in some form or its initial point and direction vector.
# The words ”A plane is given” mean that its general equation is given. You can use as an input either this equation or the vector of coefficients.
# The words ”Determine . . . , find . . . ” mean that you are asked to create a program(or some kind of software implementation) that takes as input the given data and returns the required equations.
# (3) Submit a paper that includes: a nice cover sheet, an explanation of the mathematical principles used in your programs, and a printout of sample runs of the programs. (5 points for the paper submission.)
# (4) Keep the programs on your computers. Later I will set up short meetings with you to check how your programs work on inputs selected by me. (5 points for this.)
# TODO: The problem. A line l and a point P in R3 are given.
# TODO: (1) Determine whether the point P lies on the line l.
# TODO: (2) If P is not in the line l, find the plane that contains l and P.
# TODO: (3) Find equation of the plane that passes through P perpendicular to l. (4) Find the line that passes through P and perpendicular to l.


class Point:
    def __init__(xcomp, ycomp, zcomp):
        self.x = xcomp
        self.y = ycomp
        self.z = zcomp


def main():
    print("Program running")


if __name__ == "__main__":
    main()
