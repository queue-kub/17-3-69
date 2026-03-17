```mermaid
classDiagram
    class Rectangle {
        -int width
        -int height
        +Rectangle()
        +Rectangle(int width)
        +void setWidth(int width)
        +void setHeight(int height)
        +int calculateArea()
        +int calculatePerimeter(int width, int height)
    }

    