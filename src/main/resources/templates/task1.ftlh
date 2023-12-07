<#include "header.ftlh"/>
    <div class="container mt-5">
        <form method="post" action="task1">
            <div class="mb-3">
                <input type="number" class="form-control" name="anInteger" placeholder="An Integer">
            </div>
            <div class="mb-3">
                <input type="number" class="form-control" name="numerator" placeholder="Numerator">
            </div>
            <div class="mb-3">
                <input type="number" class="form-control" name="denominator" placeholder="Denominator">
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>

    <#if isCorrect??>
        <h1>${isCorrect}</h1>
    <#else>
        <h1></h1>
    </#if>



<#include "footer.ftlh"/>