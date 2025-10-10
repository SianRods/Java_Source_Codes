<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>All Internships</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <style>
        * {
            box-sizing: border-box;
        }

        body {
            font-family: 'Inter', -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, sans-serif;
            margin: 0;
            padding: 0;
            background: linear-gradient(135deg, #f8fafc 0%, #f1f5f9 100%);
            min-height: 100vh;
            line-height: 1.5;
            color: #374151;
        }

        .header {
            text-align: center;
            padding: 2rem 1rem 1rem 1rem;
            position: relative;
        }

        .header::before {
            content: '';
            position: absolute;
            top: 0;
            left: 50%;
            transform: translateX(-50%);
            width: 100px;
            height: 4px;
            background: linear-gradient(90deg, #3b82f6, #06b6d4, #10b981);
            border-radius: 2px;
        }

        h2 {
            margin: 0;
            color: #1e293b;
            font-size: 2rem;
            font-weight: 600;
            letter-spacing: -0.025em;
        }

        .subtitle {
            margin-top: 0.5rem;
            color: #64748b;
            font-size: 1rem;
            font-weight: 400;
        }

        .container {
            display: grid;
            grid-template-columns: repeat(auto-fill, minmax(320px, 1fr));
            gap: 1.5rem;
            padding: 1rem 2rem 2rem 2rem;
            max-width: 1400px;
            margin: 0 auto;
        }

        .card {
            background: #ffffff;
            border-radius: 12px;
            padding: 1.5rem;
            box-shadow: 0 4px 6px -1px rgba(0, 0, 0, 0.1), 0 2px 4px -1px rgba(0, 0, 0, 0.06);
            border: 1px solid #e2e8f0;
            transition: all 0.2s ease-in-out;
            position: relative;
            overflow: hidden;
            display: flex;
            flex-direction: column;
        }

        .card::before {
            content: '';
            position: absolute;
            top: 0;
            left: 0;
            right: 0;
            height: 3px;
            background: linear-gradient(90deg, #3b82f6, #06b6d4);
            transform: scaleX(0);
            transition: transform 0.2s ease-in-out;
        }

        .card:hover {
            transform: translateY(-2px);
            box-shadow: 0 10px 25px -5px rgba(0, 0, 0, 0.1), 0 8px 10px -6px rgba(0, 0, 0, 0.1);
            border-color: #cbd5e1;
        }

        .card:hover::before {
            transform: scaleX(1);
        }

        .card-header {
            margin-bottom: 1rem;
        }

        .card h3 {
            margin: 0 0 0.5rem 0;
            color: #1e293b;
            font-size: 1.25rem;
            font-weight: 600;
            line-height: 1.2;
        }

        .company-name {
            color: #3b82f6;
            font-weight: 500;
            font-size: 0.95rem;
        }

        .card-content {
            flex-grow: 1;
        }

        .info-item {
            display: flex;
            align-items: center;
            margin: 0.75rem 0;
            font-size: 0.9rem;
        }

        .info-label {
            font-weight: 500;
            color: #6b7280;
            min-width: 60px;
            margin-right: 0.5rem;
        }

        .info-value {
            color: #374151;
        }

        .stipend-value {
            font-weight: 600;
            color: #10b981;
            font-size: 1rem;
        }

        .id-badge {
            display: inline-block;
            background: #f1f5f9;
            color: #475569;
            padding: 0.25rem 0.5rem;
            border-radius: 6px;
            font-size: 0.8rem;
            font-weight: 500;
            font-family: 'SF Mono', Monaco, 'Cascadia Code', monospace;
        }

        .description {
            margin-top: 1rem;
            padding-top: 1rem;
            border-top: 1px solid #f1f5f9;
        }

        .description-text {
            color: #6b7280;
            font-size: 0.9rem;
            line-height: 1.4;
            margin: 0.5rem 0 0 0;
        }

        .back-link-container {
            text-align: center;
            padding: 2rem;
        }

        .back-link {
            display: inline-flex;
            align-items: center;
            gap: 0.5rem;
            padding: 0.875rem 1.5rem;
            color: #6b7280;
            text-decoration: none;
            font-weight: 500;
            border: 2px solid #e5e7eb;
            border-radius: 8px;
            transition: all 0.2s ease-in-out;
            font-size: 0.95rem;
            background: #ffffff;
        }

        .back-link:hover {
            color: #374151;
            border-color: #d1d5db;
            background: #f9fafb;
            transform: translateY(-1px);
        }

        .back-icon {
            font-size: 1.1rem;
        }

        .empty-state {
            text-align: center;
            padding: 4rem 2rem;
            color: #6b7280;
        }

        .empty-icon {
            font-size: 4rem;
            margin-bottom: 1rem;
            opacity: 0.5;
        }

        .empty-title {
            font-size: 1.25rem;
            font-weight: 600;
            margin-bottom: 0.5rem;
            color: #374151;
        }

        .empty-description {
            font-size: 1rem;
            margin-bottom: 2rem;
        }

        /* Responsive design */
        @media (max-width: 768px) {
            .header {
                padding: 1.5rem 1rem 1rem 1rem;
            }

            h2 {
                font-size: 1.75rem;
            }

            .container {
                grid-template-columns: 1fr;
                padding: 1rem;
                gap: 1rem;
            }

            .card {
                padding: 1.25rem;
            }

            .back-link-container {
                padding: 1.5rem 1rem;
            }
        }

        @media (max-width: 640px) {
            h2 {
                font-size: 1.5rem;
            }

            .card h3 {
                font-size: 1.125rem;
            }

            .container {
                padding: 0.5rem;
            }

            .card {
                padding: 1rem;
            }

            .info-item {
                margin: 0.5rem 0;
                font-size: 0.85rem;
            }

            .back-link {
                padding: 1rem 1.25rem;
            }
        }

        @media (max-width: 480px) {
            .header {
                padding: 1rem 0.5rem 0.5rem 0.5rem;
            }

            .info-item {
                flex-direction: column;
                align-items: flex-start;
                gap: 0.25rem;
            }

            .info-label {
                min-width: auto;
                margin-right: 0;
            }
        }

        /* Dark mode support */
        @media (prefers-color-scheme: dark) {
            body {
                background: linear-gradient(135deg, #0f172a 0%, #1e293b 100%);
                color: #f8fafc;
            }

            .card {
                background: #1e293b;
                border-color: #334155;
            }

            .card h3 {
                color: #f8fafc;
            }

            .company-name {
                color: #60a5fa;
            }

            .info-label {
                color: #94a3b8;
            }

            .info-value {
                color: #f8fafc;
            }

            .stipend-value {
                color: #34d399;
            }

            .id-badge {
                background: #374151;
                color: #d1d5db;
            }

            .description {
                border-color: #334155;
            }

            .description-text {
                color: #94a3b8;
            }

            h2 {
                color: #f8fafc;
            }

            .subtitle {
                color: #94a3b8;
            }

            .back-link {
                color: #94a3b8;
                border-color: #475569;
                background: #1e293b;
            }

            .back-link:hover {
                color: #f8fafc;
                border-color: #64748b;
                background: #334155;
            }

            .empty-title {
                color: #f8fafc;
            }

            .empty-state {
                color: #94a3b8;
            }
        }

        /* Reduced motion support */
        @media (prefers-reduced-motion: reduce) {
            * {
                transition: none !important;
                animation: none !important;
            }
        }

        /* High contrast mode support */
        @media (prefers-contrast: high) {
            .card {
                border-width: 2px;
            }

            .back-link {
                border-width: 2px;
            }
        }
    </style>
</head>
<body>

<div class="header">
    <h2>All Internships</h2>
    <p class="subtitle">Explore available internship opportunities</p>
</div>

<div class="container">
    <c:choose>
        <c:when test="${empty internships}">
            <div class="empty-state">
                <div class="empty-icon">📋</div>
                <div class="empty-title">No Internships Available</div>
                <div class="empty-description">There are currently no internships posted. Check back later for new opportunities!</div>
            </div>
        </c:when>
        <c:otherwise>
            <c:forEach var="internship" items="${internships}">
                <div class="card">
                    <div class="card-header">
                        <h3>${internship.position}</h3>
                        <div class="company-name">${internship.company}</div>
                    </div>

                    <div class="card-content">
                        <div class="info-item">
                            <span class="info-label">ID:</span>
                            <span class="id-badge">#${internship.id}</span>
                        </div>

                        <div class="info-item">
                            <span class="info-label">Stipend:</span>
                            <span class="stipend-value">₹${internship.stipend}</span>
                        </div>

                        <div class="description">
                            <div class="info-label">Description:</div>
                            <p class="description-text">${internship.desc}</p>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </c:otherwise>
    </c:choose>
</div>

<div class="back-link-container">
    <a href="/" class="back-link">
        <span class="back-icon">←</span>
        Back to Home
    </a>
</div>

</body>
</html>